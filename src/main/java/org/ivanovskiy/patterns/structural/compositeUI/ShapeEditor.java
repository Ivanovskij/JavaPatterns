package org.ivanovskiy.patterns.structural.compositeUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Ivanovskij Oleg on 18.07.2018
 */
public class ShapeEditor {

    private EditorCanvas canvas;
    private CompoundShape allShapes = new CompoundShape();

    public ShapeEditor() {
        canvas = new EditorCanvas();
    }

    public void loadShapes(Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    private class EditorCanvas extends Canvas {
        private JFrame frame;
        private static final int PADDING = 10;

        private EditorCanvas() {
            createFrame();
            refresh();
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    allShapes.unSelect();
                    allShapes.selectChildAt(e.getX(), e.getY());
                    e.getComponent().repaint();
                }
            });
        }

        private void refresh() {
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }

        private void createFrame() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel contentPanel = new JPanel();
            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            contentPanel.setBorder(padding);
            frame.setContentPane(contentPanel);

            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        @Override
        public int getWidth() {
            return allShapes.getX() + allShapes.getWidth() + PADDING;
        }

        @Override
        public int getHeight() {
            return allShapes.getY() + allShapes.getHeight() + PADDING;
        }

        @Override
        public void paint(Graphics graphics) {
            allShapes.paint(graphics);
        }
    }
}
