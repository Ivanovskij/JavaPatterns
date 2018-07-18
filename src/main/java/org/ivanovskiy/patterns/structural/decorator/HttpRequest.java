package org.ivanovskiy.patterns.structural.decorator;

public interface HttpRequest {

    String getParameter(String name);
    String getHeader();

}
