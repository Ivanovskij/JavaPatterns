package org.ivanovskiy.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class Context {

    private Map<String, Double> variables = new HashMap<>();

    public Double getVariable(String name) {
        return variables.get(name);
    }

    public void setVariable(String name, Double value) {
        if (variables.containsKey(name)) {
            throw new IllegalArgumentException("Current name variable is already exists!");
        }
        variables.put(name, value);
    }

}
