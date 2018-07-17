package org.ivanovskiy.patterns.stateUI;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class App {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        AudioPlayerUI ui = new AudioPlayerUI(player);
        ui.init();
    }

}
