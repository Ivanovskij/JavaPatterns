package org.ivanovskiy.patterns.structural.adapter;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class SequenceGenerator {

    private Logger logger = Logger.getLogger(SequenceGenerator.class.getName());
    private Generator generator;

    public SequenceGenerator(Generator generator) {
        this.generator = generator;
    }

    public double[] generate(int length) {
        double[] arrayOfSequence = new double[length];
        for (int i = 0; i < length; i++) {
            arrayOfSequence[i] = generator.next();
        }
        logger.info(String.format("Sequence: %s", Arrays.toString(arrayOfSequence)));
        return arrayOfSequence;
    }
}
