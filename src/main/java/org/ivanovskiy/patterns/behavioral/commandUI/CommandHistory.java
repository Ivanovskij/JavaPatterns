package org.ivanovskiy.patterns.behavioral.commandUI;

import java.util.Stack;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void push(Command command) {
        history.push(command);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
