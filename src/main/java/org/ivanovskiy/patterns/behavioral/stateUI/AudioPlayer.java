package org.ivanovskiy.patterns.behavioral.stateUI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class AudioPlayer {

    private static final int COUNT_SONGS = 12;
    private State state;
    private boolean playing = false;
    private List<String> playList = new ArrayList<>();
    private int currentTrack = 0;

    public AudioPlayer() {
        this.state = new ReadyState(this);
        setPlaying(true);
        initPlayList();
    }

    private void initPlayList() {
        for (int song = 1; song <= COUNT_SONGS; song++) {
            playList.add("Track " + song);
        }
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayBack() {
        return "Playing " + playList.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;
        if (currentTrack > playList.size() - 1) {
            currentTrack = 0;
        }
        return startPlayBack();
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playList.size() - 1;
        }
        return startPlayBack();
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
}
