package org.ivanovskiy.patterns.behavioral.commandUI;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        getEditor().setClipboard(getEditor().getTextField().getSelectedText());
        return false;
    }
}
