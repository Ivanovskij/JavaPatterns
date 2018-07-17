package org.ivanovskiy.patterns.behavioral.observer;

import java.io.File;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public interface EventListenerObserver {

    void update(String eventType, File file);

}
