package org.example.facade;

import org.example.facade.subsystem.Amplifier;
import org.example.facade.subsystem.Projector;
import org.example.facade.subsystem.Screen;
import org.example.facade.subsystem.StreamingPlayer;

public class HomeTheaterFacade {
    private final Screen screen;
    private final Projector projector;
    private final StreamingPlayer player;
    private final Amplifier amplifier;

    public HomeTheaterFacade(Screen screen, Projector projector, StreamingPlayer player, Amplifier amplifier) {
        this.screen = screen;
        this.projector = projector;
        this.player = player;
        this.amplifier = amplifier;
    }

    public void watchMovie(String movie) {
        System.out.println("영화 시청을 준비합니다.");
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        player.on();
        player.play(movie);

    }

    public void endMovie() {
        System.out.println("영화 시청을 종료합니다.");
        player.off();
        amplifier.off();
        projector.off();
        screen.up();
    }
}
