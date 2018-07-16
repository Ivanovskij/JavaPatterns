package org.ivanovskiy.patterns.command;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CommandTest {

    @Test
    public void testScriptOfCommandPattern() {
        List<Command> commands = Arrays.asList(
                new CopyCommand(),
                new PasteCommand(),
                new CopyCommand()
        );
        MacrosInvoker macros = new MacrosInvoker(commands);
        macros.execute();
    }

}
