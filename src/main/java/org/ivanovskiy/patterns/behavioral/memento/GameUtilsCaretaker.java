package org.ivanovskiy.patterns.behavioral.memento;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class GameUtilsCaretaker {

    private Logger logger = Logger.getLogger(GameUtilsCaretaker.class.getName());

    private Memento memento;

    public void saveState(Originator originator) {
        if (originator == null) {
            throw new IllegalArgumentException("originator not be null!");
        }
        memento = originator.getMemento();
        logger.info("Save state");
    }

    public void loadState(Originator originator) {
        if (originator == null) {
            throw new IllegalArgumentException("originator not be null!");
        } else if (memento == null) {
            throw new IllegalArgumentException("memento not be null!");
        }
        originator.setMemento(memento);
        logger.info("Load state");
    }

}
