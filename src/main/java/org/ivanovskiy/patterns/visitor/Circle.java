package org.ivanovskiy.patterns.visitor;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class Circle extends Point {

    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }

}
