package org.ivanovskiy.patterns.behavioral.memento;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class Memento {

    private int health;

    public Memento(int health) {
        this.health = health;
    }

    public int getState() {
        return health;
    }
}
