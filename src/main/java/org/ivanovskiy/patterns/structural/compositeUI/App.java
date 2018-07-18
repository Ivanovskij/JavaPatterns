package org.ivanovskiy.patterns.structural.compositeUI;

import java.awt.*;

/**
 * Created by Ivanovskij Oleg on 18.07.2018
 */
public class App {

    public static void main(String[] args) {
        ShapeEditor editor = new ShapeEditor();

        editor.loadShapes(
                new Circle(20, 20, 20, Color.DARK_GRAY),

                new Rectangle(70, 70, 40, 40, Color.YELLOW),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Point(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Point(240, 240, Color.GREEN),
                        new Point(240, 360, Color.GREEN),
                        new Point(360, 360, Color.GREEN),
                        new Point(360, 240, Color.GREEN)
                )
        );
    }

}
