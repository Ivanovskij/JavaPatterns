package org.ivanovskiy.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class CompoundShape implements Shape {

    private int id;
    private List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        // move shapes
    }

    @Override
    public void draw() {
        // draw shapes
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public int getId() {
        return id;
    }

    public List<Shape> getChildren() {
        return children;
    }
}
