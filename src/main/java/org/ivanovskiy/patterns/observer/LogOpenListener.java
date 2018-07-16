package org.ivanovskiy.patterns.observer;

import java.io.File;
import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class LogOpenListener implements EventListenerObserver {

    private Logger logger = Logger.getLogger(LogOpenListener.class.getName());

    private File logFile;

    public LogOpenListener(String fileName) {
        this.logFile = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        logger.info(String.format("Save to log %s: Someone has performed %s operation with the following file: %s",
                logFile, eventType, file.getPath()));
    }
}
