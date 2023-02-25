import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSetStationMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        int expected = 5;
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
    public void shouldSetStationNine() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        int expected = 9;
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
    public void shouldSetStationOne() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        int expected = 1;
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
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextStationTestPositive() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextStationTestNegative() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.next();
        int expected = 9;
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
    public void nextStationTestBorderZero() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevStationTestPositive() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevStationTestNegative() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prev();
        int expected = 0;
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
    public void shouldSetVolumeMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
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
    public void shouldSetVolumeTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
        @Test
    public void shouldSetVolumeNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
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
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
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
    public void nextVolumeTestPositive() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.nextVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeTestNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.nextVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeTestBorderNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.nextVolume();
        int expected = 10;
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
    public void prevVolumeTestPositive() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.prevVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void prevVolumeTestNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
