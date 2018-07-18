package org.ivanovskiy.patterns.creational.prototype;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class AutoPrototypeTest {

    @Test
    public void testOriginalColorAutoIsEqualToCloneAutoColorFord() {
        Ford ford = new Ford();
        Ford fordCopy = (Ford) ford.clone();
        assertEquals(ford.getColor(), fordCopy.getColor());
    }

    @Test
    public void testOriginalColorAutoIsEqualToCloneAutoColorNissan() {
        Nissan nissan = new Nissan();
        Nissan nissanCopy = (Nissan) nissan.clone();
        assertEquals(nissan.getColor(), nissanCopy.getColor());
    }

    @Test
    public void testOriginalObjectAutoIsNotEqualToCloneObjectAuto() {
        Ford ford = new Ford();
        Ford fordCopy = (Ford) ford.clone();
        assertNotEquals(ford, fordCopy);
    }

}
