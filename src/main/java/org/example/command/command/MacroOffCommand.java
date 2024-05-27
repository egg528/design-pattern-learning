package org.example.command.command;

import org.example.command.receiver.Light;

/**
 * ConcreteCommand: 특정 행동과 Receiver를 연결해주는 역할을 한다.
 */
public class MacroOffCommand implements Command {
    private final Command[] commands;;

    public MacroOffCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        System.out.println("Macro off");
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        System.out.println("Macro off undo");
        for (Command command : commands) {
            command.undo();
        }
    }
}
