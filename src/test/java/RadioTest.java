import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationZero() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOne() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationEight() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNine() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestBorderMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestBorderZero() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestBorderOne() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestBorderEight() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestBorderNine() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestBorderTen() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestBorderMunusOne() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestBorderZero() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestBorderOne() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestBorderEight() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestBorderNine() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestBorderTen() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrShouldNotSetStationBelowMin() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrShouldSetStationBorderZero() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrShouldSetStationBorderOne() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrShouldSetStationMiddle() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(15);
        int expected = 15;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrShouldSetStationBorderTwentyNine() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(29);
        int expected = 29;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrShouldSetStationBorderThirty() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(30);
        int expected = 30;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrShouldSetStationBorderThirtyOne() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(31);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrNextStationTestBorderMinusOne() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(-1);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrNextStationTestBorderZero() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrNextStationTestBorderOne() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrNextStationTestMiddle() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(15);
        radio.next();
        int expected = 16;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrNextStationTestBorderTwentyNine() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(29);
        radio.next();
        int expected = 30;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrNextStationTestBorderThirty() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(30);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrNextStationTestBorderThirtyOne() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(31);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrPrevStationTestBorderMunusOne() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(-1);
        radio.prev();
        int expected = 30;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrPrevStationTestBorderZero() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(0);
        radio.prev();
        int expected = 30;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrPrevStationTestBorderOne() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrPrevStationTestMiddle() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(15);
        radio.prev();
        int expected = 14;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrPrevStationTestBorderTwentyNine() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(29);
        radio.prev();
        int expected = 28;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrPrevStationTestBorderThirty() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(30);
        radio.prev();
        int expected = 29;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void constrPrevStationTestBorderThirtyOne() {
        Radio radio = new Radio(31);
        radio.setCurrentStationNumber(31);
        radio.prev();
        int expected = 30;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeNinetyNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOneHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTestBorderMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTestBorderZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTestBorderOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.nextVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTestMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.nextVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTestBorderNinetyNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.nextVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTestBorderOneHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTestBorderOneHundredAndOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeTestBorderMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeTestBorderZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeTestBorderOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeTestMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.prevVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeTestBorderNinetyNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.prevVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeTestBorderOneHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.prevVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeTestBorderOneHundredAndOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
