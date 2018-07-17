package org.ivanovskiy.patterns.interpreter;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 *
 * NonTerminal Expression
 */
public class AddExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    public AddExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public double interpret(Context context) {
        return firstExpression.interpret(context) + secondExpression.interpret(context);
    }

}
