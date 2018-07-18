package org.ivanovskiy.patterns.structural.decorator;

/**
 * Created by Ivanovskij Oleg on 18.07.2018
 */
public class HttpRequestDecorator implements HttpRequest {

    private HttpRequest httpRequest;

    public HttpRequestDecorator(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    @Override
    public String getParameter(String name) {
        return httpRequest.getParameter(name);
    }

    @Override
    public String getHeader() {
        return httpRequest.getHeader();
    }
}
