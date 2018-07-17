package org.ivanovskiy.patterns.stateUI;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 *
 * Общий интерфейс всех состояний.
 */
public abstract class State {

    protected AudioPlayer audioPlayer;

    /**
     * Контекст передаёт себя в конструктор состояния, чтобы состояние могло
     * обращаться к его данным и методам в будущем, если потребуется.
     */
    public State(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }


    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();

}
