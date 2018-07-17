package org.ivanovskiy.patterns.behavioral.state;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class LoadedPage implements State {

    private Logger logger = Logger.getLogger(LoadedPage.class.getName());
    private PageContext pageContext;

    public LoadedPage(PageContext pageContext) {
        this.pageContext = pageContext;
    }

    @Override
    public void handle() {
        logger.info("Page was loaded!");
        pageContext.lifecycleWasBuilt();
    }
}
