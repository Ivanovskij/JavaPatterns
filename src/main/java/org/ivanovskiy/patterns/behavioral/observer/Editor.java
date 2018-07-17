package org.ivanovskiy.patterns.behavioral.observer;

import java.io.File;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class Editor {

    private static final String OPEN_OPERATION = "open";
    private static final String SAVE_OPERATION = "save";
    private Event events;
    private File file;

    public Editor() {
        this.events = new EventManager(OPEN_OPERATION, SAVE_OPERATION);
    }

    public void openFile(String filePath) {
        file = new File(filePath);
        events.notify(OPEN_OPERATION, file);
    }

    public void saveFile() {
        if (file == null) {
            throw new IllegalArgumentException("Please open a file first.");
        }
        events.notify(SAVE_OPERATION, file);
    }

    public Event getEvents() {
        return events;
    }
}
