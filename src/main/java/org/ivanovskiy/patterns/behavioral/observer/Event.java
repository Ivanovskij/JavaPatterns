package org.ivanovskiy.patterns.behavioral.observer;

import java.io.File;

public interface Event {

    void subscribe(String eventType, EventListenerObserver listener);
    void unsubscribe(String eventType, EventListenerObserver listener);
    void notify(String eventType, File file);

}
