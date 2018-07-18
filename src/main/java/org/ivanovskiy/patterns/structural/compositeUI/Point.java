package org.ivanovskiy.patterns.structural.compositeUI;

import java.awt.*;

/**
 * Created by Ivanovskij Oleg on 18.07.2018
 */
public class Point extends BaseShape {

    private static final int POINT_SIZE = 3;

    public Point(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return POINT_SIZE;
    }

    @Override
    public int getHeight() {
        return POINT_SIZE;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(getX() - 1, getY() - 1, getWidth(), getHeight());
    }
}
