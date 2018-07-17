package org.ivanovskiy.patterns.interpreter;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 *
 * TerminalExpression
 */
public class NumberExpression implements Expression {

    private String name;

    public NumberExpression(String name) {
        this.name = name;
    }

    @Override
    public double interpret(Context context) {
        return context.getVariable(name);
    }
}
