package org.ivanovskiy.patterns.behavioral.visitor;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class XMLExportVisitor implements Visitor {

    private Logger logger = Logger.getLogger(XMLExportVisitor.class.getName());

    public String export(Shape... args) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : args) {
            sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
            sb.append(shape.accept(this)).append("\n");
            logger.info(sb.toString());
            sb.setLength(0);
        }
        return sb.toString();
    }

    @Override
    public String visitPoint(Point p) {
        return "<point>" + "\n" +
                "    <id>" + p.getId() + "</id>" + "\n" +
                "    <x>" + p.getX() + "</x>" + "\n" +
                "    <y>" + p.getY() + "</y>" + "\n" +
                "</point>";
    }

    @Override
    public String visitCircle(Circle c) {
        return "<circle>" + "\n" +
                "    <id>" + c.getId() + "</id>" + "\n" +
                "    <x>" + c.getX() + "</x>" + "\n" +
                "    <y>" + c.getY() + "</y>" + "\n" +
                "    <radius>" + c.getRadius() + "</radius>" + "\n" +
                "</circle>";
    }

    @Override
    public String visitRectangle(Rectangle r) {
        return "<rectangle>" + "\n" +
                "    <id>" + r.getId() + "</id>" + "\n" +
                "    <x>" + r.getX() + "</x>" + "\n" +
                "    <y>" + r.getY() + "</y>" + "\n" +
                "    <width>" + r.getWidth() + "</width>" + "\n" +
                "    <height>" + r.getHeight() + "</height>" + "\n" +
                "</rectangle>";
    }

    @Override
    public String visitCompoundGraphic(CompoundShape cg) {
        return "<compound_graphic>" + "\n" +
                "   <id>" + cg.getId() + "</id>" + "\n" +
                _visitCompoundGraphic(cg) +
                "</compound_graphic>";
    }

    private String _visitCompoundGraphic(CompoundShape cg) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : cg.getChildren()) {
            String obj = shape.accept(this);
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }
}
