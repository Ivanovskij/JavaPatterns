package org.ivanovskiy.patterns.command;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public interface Command {

    void execute();
    void undo();

}
