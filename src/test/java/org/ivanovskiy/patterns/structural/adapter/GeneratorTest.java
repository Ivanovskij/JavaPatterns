package org.ivanovskiy.patterns.structural.adapter;

import org.testng.annotations.Test;

public class GeneratorTest {

    @Test
    public void testScriptOfGeneratorAdapter() {
        Generator randomGeneratorAdapter = new RandomGeneratorAdapter();
        Generator customGeneratorAdapter  = new CustomGeneratorAdapter();

        SequenceGenerator sequenceGenerator = new SequenceGenerator(randomGeneratorAdapter);
        sequenceGenerator.generate(10);

        sequenceGenerator = new SequenceGenerator(customGeneratorAdapter);
        sequenceGenerator.generate(5);
    }

}
