package org.ivanovskiy.patterns.behavioral.memento;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class PlayerOriginator implements Originator {

    private Logger logger = Logger.getLogger(PlayerOriginator.class.getName());

    private int health;

    public PlayerOriginator() {
        this.health = 100;  // default
    }

    public void hurt(int percentHurt) {
        health -= percentHurt;
    }

    public void cure(int percentCure) {
        health += percentCure;
    }

    public void printPulse() {
        if(health > 70) { logger.info("Green health"); }
        else if(health <= 70 && health > 40) { logger.info("Yellow health");  }
        else if (health <= 40) { logger.info("Red health"); }
    }

    public Memento getMemento() {
        return new Memento(health);
    }

    public void setMemento(Memento memento) {
        health = memento.getState();
    }
}
