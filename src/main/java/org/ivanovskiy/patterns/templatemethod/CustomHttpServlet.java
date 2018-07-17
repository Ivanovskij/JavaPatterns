package org.ivanovskiy.patterns.templatemethod;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class CustomHttpServlet extends AbstractHttpServlet {

    private Logger logger = Logger.getLogger(CustomHttpServlet.class.getName());

    @Override
    protected void doPost() {
        logger.info("Custom post method...");
    }

    @Override
    protected void doGet() {
        logger.info("Custom get method...");
    }

}
