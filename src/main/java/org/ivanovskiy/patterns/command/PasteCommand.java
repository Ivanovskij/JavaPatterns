package org.ivanovskiy.patterns.command;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class PasteCommand implements Command {

    private Logger logger = Logger.getLogger(CopyCommand.class.getName());

    @Override
    public void execute() {
        logger.info("paste command execute");
    }

    @Override
    public void undo() {
        logger.info("paste command undo");
    }

}
