package org.example.command.command;

/**
 * Command: 모든 ConcreteCommand가 구현해야하는 인터페이스
 */
public interface Command {
    /**
     * Receiver에 특정 작업을 처리하라는 지시를 전달한다.
     */
    void execute();

    /**
     *
     */
    void undo();
}
