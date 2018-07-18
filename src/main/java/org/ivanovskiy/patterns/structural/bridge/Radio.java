package org.ivanovskiy.patterns.structural.bridge;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class Radio implements Device {

    private static final Logger logger = Logger.getLogger(Radio.class.getName());

    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            volume = 100;
        }
        else if (volume < 0) {
            volume = 0;
        }
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        String buffer = "------------------------------------" + System.lineSeparator();
        buffer += "| I'm radio." + System.lineSeparator();
        buffer += "| I'm " + (on ? "enabled" : "disabled") + System.lineSeparator();
        buffer += "| Current volume is " + volume + "%" + System.lineSeparator();
        buffer += "| Current channel is " + channel + System.lineSeparator();
        buffer += "------------------------------------" + System.lineSeparator();
        logger.info(buffer);
    }
}
