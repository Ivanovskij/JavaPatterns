package org.ivanovskiy.patterns.creational.prototype;

/**
 * Created by Ivanovskij Oleg on 18.07.2018
 */
public class Ford extends AutoPrototype {

    private String color = "blue";

    public Ford() {
    }

    public Ford(Ford target) {
        super(target);
        this.color = target.color;
    }

    @Override
    public int getWeight() {
        return 100;
    }

    @Override
    public int getPower() {
        return 109;
    }

    @Override
    public AutoPrototype clone() {
        return new Ford(this);
    }

    public String getColor() {
        return color;
    }
}
