package org.ivanovskiy.patterns.structural.decorator;

import org.testng.annotations.Test;

import java.util.logging.Logger;

public class DecoratorTest {

    private static final Logger logger = Logger.getLogger(DecoratorTest.class.getName());

    @Test
    public void testScriptOfDecorator() {
        HttpRequestDecorator httpRequest = new DefaultHttpRequestDecorator(
                new CustomHttpRequestDecorator(new HttpServletRequest())
        );
        logger.info(httpRequest.getParameter("Oleg"));
        logger.info(httpRequest.getHeader());
    }

}
