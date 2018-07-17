package org.ivanovskiy.patterns.behavioral.visitor;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class Point implements Shape {

    private int id;
    private int x;
    private int y;

    public Point() {
    }

    public Point(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitPoint(this);
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
