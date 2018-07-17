package org.ivanovskiy.patterns.interpreter;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExpressionTest {

    @Test
    public void testScriptOfExpression() {
        double x = 10.0;
        double y = 1.0;
        double z = -3.0;

        Context context = new Context();
        context.setVariable("x", x);
        context.setVariable("y", y);
        context.setVariable("z", z);

        Expression expression = new AddExpression(
                new MultiplyExpression(new NumberExpression("x"), new NumberExpression("y")),
                new NumberExpression("z")
        );

        double expectedResult = x * y + z;
        double actualResult = expression.interpret(context);
        assertEquals(actualResult, expectedResult);
    }


}
