package org.ivanovskiy.patterns.commandUI;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public abstract class Command {

    private Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = editor.getTextField().getText();
    }

    public void undo() {
        editor.getTextField().setText(backup);
    }

    public abstract boolean execute();

    public Editor getEditor() {
        return editor;
    }
}
