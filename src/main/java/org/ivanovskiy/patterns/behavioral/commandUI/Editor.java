package org.ivanovskiy.patterns.behavioral.commandUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class Editor {

    private JTextArea textField;
    private String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init() {
        JFrame frame = new JFrame("Text editor (type & use buttons!)");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");
        ctrlC.addActionListener(e -> executeCommand(new CopyCommand(this)));
        ctrlX.addActionListener(e -> executeCommand(new CutCommand(this)));
        ctrlV.addActionListener(e -> executeCommand(new PasteCommand(this)));
        ctrlZ.addActionListener(e -> undo());
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty()) return;
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    public JTextArea getTextField() {
        return textField;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public String getClipboard() {
        return clipboard;
    }
}
