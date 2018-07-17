package org.ivanovskiy.patterns.templatemethod;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AbstractHttpServletTest {

    @Test
    public void testCheckingThatVersionOfDefaultHttpServletIsEqualToAbstractHttpServlet() {
        AbstractHttpServlet httpServlet = new DefaultHttpServlet();
        httpServlet.doGet();
        assertEquals(httpServlet.versionServlet(), AbstractHttpServlet.VERSION_SERVLET);
    }

    @Test
    public void testCheckingThatVersionOfDefaultHttpServletIsEqualToCustomHttpServlet() {
        AbstractHttpServlet httpServlet = new CustomHttpServlet();
        httpServlet.doPost();
        assertEquals(httpServlet.versionServlet(), AbstractHttpServlet.VERSION_SERVLET);
    }
}
