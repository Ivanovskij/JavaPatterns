package org.ivanovskiy.patterns.structural.compositeUI;

import java.awt.*;

/**
 * Created by Ivanovskij Oleg on 18.07.2018
 */
public class Circle extends BaseShape {

    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(getX(), getY(), getWidth() - 1, getHeight() - 1);
    }
}
