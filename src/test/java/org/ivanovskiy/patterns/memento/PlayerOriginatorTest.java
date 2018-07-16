package org.ivanovskiy.patterns.memento;

import org.testng.annotations.Test;

public class PlayerOriginatorTest {


    @Test
    public void testScriptOfPlayerOriginator() {
        GameUtilsCaretaker gameUtils = new GameUtilsCaretaker();
        PlayerOriginator player = new PlayerOriginator();

        player.hurt(20);
        player.hurt(30);
        player.hurt(20);
        player.printPulse();

        gameUtils.saveState(player);

        player.cure(30);
        player.printPulse();

        gameUtils.loadState(player);

        player.printPulse();
    }

}
