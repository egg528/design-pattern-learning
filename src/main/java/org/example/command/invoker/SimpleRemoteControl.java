package org.example.command.invoker;

import org.example.command.command.Command;

/**
 * Invoker: Command가 포함되어 있으며 execute()를 사용해 Command 객체에게 작업을 요청하게 된다.
 */
public class SimpleRemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public SimpleRemoteControl(int slot) {
        onCommands = new Command[slot];
        offCommands = new Command[slot];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand; // 배열에 값 할당
        offCommands[slot] = offCommand; // 배열에 값 할당
    }

    public void onButtonWasPushed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
        }

        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
        }

        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("=========== 리모콘 ============");
        stringBuilder.append(System.lineSeparator());
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot %d onCommand]: %s".formatted(i, onCommands[i].getClass().getName()));
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append("[slot %d offCommand]: %s".formatted(i, offCommands[i].getClass().getName()));
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(System.lineSeparator());
        }

        if (undoCommand != null) {
            stringBuilder.append("[undoCommand]: %s".formatted(undoCommand.getClass().getName()));
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}
