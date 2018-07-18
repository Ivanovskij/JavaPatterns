package org.ivanovskiy.patterns.structural.decorator;

/**
 * Created by Ivanovskij Oleg on 18.07.2018
 */
public class CustomHttpRequestDecorator extends HttpRequestDecorator {

    public CustomHttpRequestDecorator(HttpRequest httpRequest) {
        super(httpRequest);
    }

    @Override
    public String getHeader() {
        return "Custom header + super header = " + super.getHeader();
    }
}
