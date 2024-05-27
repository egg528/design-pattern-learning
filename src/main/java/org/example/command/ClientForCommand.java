package org.example.command;

import org.example.command.command.*;
import org.example.command.invoker.SimpleRemoteControl;
import org.example.command.receiver.Light;

public class ClientForCommand {
    private static final int SLOT_SIZE = 3;

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl(SLOT_SIZE);

        remoteControl.setCommand(0, new LightOnCommand(new Light()), new LightOffCommand(new Light()));
        remoteControl.setCommand(1, new LightOnCommand(new Light()), new LightOffCommand(new Light()));
        remoteControl.setCommand(
                2,
                new MacroOnCommand(new Command[]{new LightOnCommand(new Light()), new LightOnCommand(new Light())}),
                new MacroOffCommand(new Command[]{new LightOffCommand(new Light()), new LightOffCommand(new Light())})
        );

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
    }
}
