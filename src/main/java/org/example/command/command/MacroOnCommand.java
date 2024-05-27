package org.example.command.command;

import org.example.command.receiver.Light;

/**
 * ConcreteCommand: 특정 행동과 Receiver를 연결해주는 역할을 한다.
 */
public class MacroOnCommand implements Command {
    private final Command[] commands;

    public MacroOnCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        System.out.println("Macro on");
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        System.out.println("Macro on undo");
        for (Command command : commands) {
            command.undo();
        }
    }
}
