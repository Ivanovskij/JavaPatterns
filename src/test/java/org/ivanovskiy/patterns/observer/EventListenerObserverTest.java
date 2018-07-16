package org.ivanovskiy.patterns.observer;

import org.testng.annotations.Test;

public class EventListenerObserverTest {

    @Test
    public void testScriptOfEventListenerObserver() {
        Editor editor = new Editor();
        editor.getEvents().subscribe("open", new EmailNotificationListener("oleg@mail.ru"));
        editor.getEvents().subscribe("open", new LogOpenListener("logger.dat"));

        editor.openFile("f://testdir/");
        editor.saveFile();
    }

}
