package org.ivanovskiy.patterns.behavioral.command;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public interface Command {

    void execute();
    void undo();

}
