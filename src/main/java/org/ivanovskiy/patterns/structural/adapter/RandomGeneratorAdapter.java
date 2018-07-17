package org.ivanovskiy.patterns.structural.adapter;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class RandomGeneratorAdapter extends RandomGenerator implements Generator {

    @Override
    public double next() {
        return generate();
    }

}
