package org.ivanovskiy.patterns.observer;

import java.io.File;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class EventManager implements Event {

    private Map<String, List<EventListenerObserver>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        Stream.of(operations).forEach(
                operation-> this.listeners.put(operation, new ArrayList<>())
        );
    }

    @Override
    public void subscribe(String eventType, EventListenerObserver listener) {
        List<EventListenerObserver> users = listeners.get(eventType);
        users.add(listener);
    }

    @Override
    public void unsubscribe(String eventType, EventListenerObserver listener) {
        List<EventListenerObserver> users = listeners.get(eventType);
        int index = users.indexOf(listener);
        users.remove(index);
    }

    @Override
    public void notify(String eventType, File file) {
        List<EventListenerObserver> users = listeners.get(eventType);
        users.forEach(listener -> listener.update(eventType, file));
    }
}
