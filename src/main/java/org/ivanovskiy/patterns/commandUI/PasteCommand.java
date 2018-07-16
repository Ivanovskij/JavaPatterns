package org.ivanovskiy.patterns.commandUI;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (getEditor().getClipboard() == null || getEditor().getClipboard().isEmpty()) {
            return false;
        }
        backup();
        getEditor().getTextField().insert(
                getEditor().getClipboard(),
                getEditor().getTextField().getCaretPosition());
        return true;
    }
}
