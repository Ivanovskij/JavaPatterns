package org.ivanovskiy.patterns.creational.prototype;

public abstract class AutoPrototype {

    private int cost = 2000;

    public AutoPrototype() {
    }

    public AutoPrototype(AutoPrototype target) {
        if (target != null) {
            this.cost = target.cost;
        }
    }

    int getWeight() { return 0; }
    int getPower() { return 0; }

    public abstract AutoPrototype clone();

}
