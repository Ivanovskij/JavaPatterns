package org.ivanovskiy.patterns.structural.bridge;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class BasicRemote implements Remote {

    private static final Logger logger = Logger.getLogger(BasicRemote.class.getName());

    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        logger.info("Remote: power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        logger.info("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        logger.info("Remote: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        logger.info("Remote: channel down");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        logger.info("Remote: channel up");
        device.setChannel(device.getChannel() + 1);
    }
}
