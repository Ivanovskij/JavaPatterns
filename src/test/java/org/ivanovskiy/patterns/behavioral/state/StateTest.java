package org.ivanovskiy.patterns.behavioral.state;

import org.testng.annotations.Test;

public class StateTest {

    @Test
    public void testScriptOfState() {
        PageContext pageContext = new PageContext();
        pageContext.buildLifecycle().getState().handle();
    }


}
