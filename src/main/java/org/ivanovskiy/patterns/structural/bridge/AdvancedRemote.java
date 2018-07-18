package org.ivanovskiy.patterns.structural.bridge;

import java.util.logging.Logger;

/**
 * Created by Ivanovskij Oleg on 17.07.2018
 */
public class AdvancedRemote extends BasicRemote {

    private static final Logger logger = Logger.getLogger(BasicRemote.class.getName());


    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        logger.info("Remote: mute");
        device.setVolume(0);
    }
}
