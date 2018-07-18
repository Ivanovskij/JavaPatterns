package org.ivanovskiy.patterns.structural.compositeUI;

import java.awt.*;

/**
 * Created by Ivanovskij Oleg on 18.07.2018
 */
public class Rectangle extends BaseShape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(getX(), getY(), getWidth() - 1, getHeight() - 1);
    }
}
