package org.ivanovskiy.patterns.state;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class PageContext {

    private Logger logger = Logger.getLogger(PageContext.class.getName());
    private State state;

    public PageContext() {
    }

    private PageContext(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public PageContext buildLifecycle() {
        logger.info("Lifecycle is running!");
        this.state = new PreLoadedPage(this);
        return new PageContext(this.state);
    }

    public void lifecycleWasBuilt() {
        logger.info("Lifecycle was built!");
    }
}
