package org.ivanovskiy.patterns.behavioral.stateUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class AudioPlayerUI {

    private AudioPlayer audioPlayer;
    private static JTextField textField = new JTextField();

    public AudioPlayerUI(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void init() {
        JFrame frame = new JFrame("AudioPlayer");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);
        // Контекст заставляет состояние реагировать на пользовательский ввод
        // вместо себя. Реакция может быть разной в зависимости от того, какое
        // состояние сейчас активно.
        JButton play = new JButton("Play");
        play.addActionListener(e -> textField.setText(audioPlayer.getState().onPlay()));
        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> textField.setText(audioPlayer.getState().onLock()));
        JButton next = new JButton("Next");
        next.addActionListener(e -> textField.setText(audioPlayer.getState().onNext()));
        JButton prev = new JButton("Prev");
        prev.addActionListener(e -> textField.setText(audioPlayer.getState().onPrevious()));
        frame.setVisible(true);
        frame.setSize(300, 100);
        buttons.add(play);
        buttons.add(stop);
        buttons.add(next);
        buttons.add(prev);
    }
}
