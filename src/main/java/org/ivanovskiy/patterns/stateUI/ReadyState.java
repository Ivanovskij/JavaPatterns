package org.ivanovskiy.patterns.stateUI;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 *
 * Они также могут переводить контекст в другие состояния.
 */
public class ReadyState extends State {

    private static final String LOCKED_STATE = "Locked...";

    public ReadyState(AudioPlayer audioPlayer) {
        super(audioPlayer);
    }

    @Override
    public String onLock() {
        audioPlayer.changeState(new LockedState(audioPlayer));
        return LOCKED_STATE;
    }

    @Override
    public String onPlay() {
        String action = audioPlayer.startPlayBack();
        audioPlayer.changeState(new PlayingState(audioPlayer));
        return action;
    }

    @Override
    public String onNext() {
        return LOCKED_STATE;
    }

    @Override
    public String onPrevious() {
        return LOCKED_STATE;
    }

}
