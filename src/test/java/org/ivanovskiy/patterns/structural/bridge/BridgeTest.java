package org.ivanovskiy.patterns.structural.bridge;

import org.testng.annotations.Test;

public class BridgeTest {

    @Test
    public void testScriptOfBridge() {
        Device radio = new Radio();
        BasicRemote basicRemote = new BasicRemote(radio);
        radio.printStatus();
        basicRemote.power();
        radio.printStatus();

        Device tv = new Tv();
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);
        tv.printStatus();
        advancedRemote.mute();
        tv.printStatus();
    }


}
