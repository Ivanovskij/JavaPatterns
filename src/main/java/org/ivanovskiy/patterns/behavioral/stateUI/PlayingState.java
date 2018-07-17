package org.ivanovskiy.patterns.behavioral.stateUI;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class PlayingState extends State {
    public PlayingState(AudioPlayer audioPlayer) {
        super(audioPlayer);
    }

    @Override
    public String onLock() {
        audioPlayer.changeState(new LockedState(audioPlayer));
        audioPlayer.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        audioPlayer.changeState(new ReadyState(audioPlayer));
        return "Paused...";
    }

    @Override
    public String onNext() {
        return audioPlayer.nextTrack();
    }

    @Override
    public String onPrevious() {
        return audioPlayer.previousTrack();
    }
}
