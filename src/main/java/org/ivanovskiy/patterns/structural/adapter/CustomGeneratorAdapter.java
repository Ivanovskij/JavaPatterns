package org.ivanovskiy.patterns.structural.adapter;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class CustomGeneratorAdapter implements Generator {

    private static final int CUSTOM_NUMBER = 10;

    @Override
    public double next() {
        return CUSTOM_NUMBER;
    }
}
