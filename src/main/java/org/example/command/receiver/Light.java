package org.example.command.receiver;


/**
 * Receiver : 실제 작업을 수행하는 객체
 */
public class Light {

    public void on() {
        System.out.println("조명이 켜졌습니다!");
    }

    public void off() {
        System.out.println("조명이 꺼졌습니다.");
    }
}
