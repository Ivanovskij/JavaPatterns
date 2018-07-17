package org.ivanovskiy.patterns.stateUI;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class LockedState extends State {

    public LockedState(AudioPlayer audioPlayer) {
        super(audioPlayer);
    }

    @Override
    public String onLock() {
        if (audioPlayer.isPlaying()) {
            audioPlayer.changeState(new ReadyState(audioPlayer));
            return "Stop playing";
        } else {
            return "Locked";
        }
    }

    @Override
    public String onPlay() {
        audioPlayer.changeState(new ReadyState(audioPlayer));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
