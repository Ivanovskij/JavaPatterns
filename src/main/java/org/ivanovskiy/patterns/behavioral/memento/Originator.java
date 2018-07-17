package org.ivanovskiy.patterns.behavioral.memento;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public interface Originator {

    Memento getMemento();
    void setMemento(Memento memento);
}
