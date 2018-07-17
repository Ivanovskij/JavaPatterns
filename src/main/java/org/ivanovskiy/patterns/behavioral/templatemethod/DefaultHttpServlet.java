package org.ivanovskiy.patterns.behavioral.templatemethod;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class DefaultHttpServlet extends AbstractHttpServlet {

    private Logger logger = Logger.getLogger(DefaultHttpServlet.class.getName());

    @Override
    protected void doPost() {
        logger.info("Default post method...");
    }

    @Override
    protected void doGet() {
        logger.info("Default get method...");
    }
}
