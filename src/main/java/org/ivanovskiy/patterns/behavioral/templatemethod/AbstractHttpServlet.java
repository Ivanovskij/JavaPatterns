package org.ivanovskiy.patterns.behavioral.templatemethod;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public abstract class AbstractHttpServlet {

    private Logger logger = Logger.getLogger(AbstractHttpServlet.class.getName());

    public static final String VERSION_SERVLET = "1.0";

    protected abstract void doPost();
    protected abstract void doGet();

    // Common methods
    public String versionServlet() {
        return VERSION_SERVLET;
    }

    public void simulateHandling() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            logger.info("InterruptedException: " + ex.getMessage());
            Thread.currentThread().interrupt();
        }
    }

}
