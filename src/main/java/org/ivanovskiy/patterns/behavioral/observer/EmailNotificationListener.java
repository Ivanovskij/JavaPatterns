package org.ivanovskiy.patterns.behavioral.observer;

import java.io.File;
import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class EmailNotificationListener implements EventListenerObserver {

    private Logger logger = Logger.getLogger(EmailNotificationListener.class.getName());

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        logger.info(String.format("Email to %s: Someone has performed %s operation with the following file: %s",
                email, eventType, file.getName()));
    }
}
