package org.ivanovskiy.patterns.structural.decorator;

/**
 * Created by Ivanovskij Oleg on 18.07.2018
 */
public class HttpServletRequest implements HttpRequest {

    private static final String HEADER_VALUE = "METHOD: GET";

    @Override
    public String getParameter(String name) {
        return "HttpServletRequest parameter = " + name;
    }

    @Override
    public String getHeader() {
        return "HttpServletRequest header = " + HEADER_VALUE;
    }

}
