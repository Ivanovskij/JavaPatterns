package org.ivanovskiy.patterns.behavioral.state;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class PreLoadedPage implements State {

    private Logger logger = Logger.getLogger(PreLoadedPage.class.getName());
    private PageContext pageContext;

    public PreLoadedPage(PageContext pageContext) {
        this.pageContext = pageContext;
    }

    @Override
    public void handle() {
        logger.info("Page is loading!");
        pageContext.changeState(new LoadedPage(pageContext));
        pageContext.getState().handle();
    }
}
