package org.ivanovskiy.patterns.structural.decorator;

/**
 * Created by Ivanovskij Oleg on 18.07.2018
 */
public class DefaultHttpRequestDecorator extends HttpRequestDecorator {

    public DefaultHttpRequestDecorator(HttpRequest httpRequest) {
        super(httpRequest);
    }

    @Override
    public String getHeader() {
        return "Default header + super header = " + super.getHeader();
    }

}
