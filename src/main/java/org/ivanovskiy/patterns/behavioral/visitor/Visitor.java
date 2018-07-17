package org.ivanovskiy.patterns.behavioral.visitor;

public interface Visitor {

    String visitPoint(Point point);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);

}
