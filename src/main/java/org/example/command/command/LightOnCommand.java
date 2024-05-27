package org.example.command.command;

import org.example.command.receiver.Light;

/**
 * ConcreteCommand: 특정 행동과 Receiver를 연결해주는 역할을 한다.
 */
public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
