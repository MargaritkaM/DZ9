package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationMoreMax() {
        Radio gaga = new Radio();

        gaga.setCurrentStation(10);

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLessMin() {
        Radio gaga = new Radio();

        gaga.setCurrentStation(-1);

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMin() {
        Radio gaga = new Radio();

        gaga.setCurrentStation(0);

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMax() {
        Radio gaga = new Radio();

        gaga.setCurrentStation(9);

        int expected = 9;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBeforeMax() {
        Radio gaga = new Radio();

        gaga.setCurrentStation(8);

        int expected = 8;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBeforeMin() {
        Radio gaga = new Radio();

        gaga.setCurrentStation(1);

        int expected = 1;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMiddle() {
        Radio gaga = new Radio();

        gaga.setCurrentStation(5);

        int expected = 5;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextMiddle() {
        Radio gaga = new Radio();
        gaga.setCurrentStation(5);

        gaga.next();

        int expected = 6;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextMin() {
        Radio gaga = new Radio();
        gaga.setCurrentStation(0);

        gaga.next();

        int expected = 1;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextMax() {
        Radio gaga = new Radio();
        gaga.setCurrentStation(9);

        gaga.next();

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextBeforeMin() {
        Radio gaga = new Radio();
        gaga.setCurrentStation(1);

        gaga.next();

        int expected = 2;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextBeforeMax() {
        Radio gaga = new Radio();
        gaga.setCurrentStation(8);

        gaga.next();

        int expected = 9;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevMax() {
        Radio gaga = new Radio();
        gaga.setCurrentStation(9);

        gaga.prev();

        int expected = 8;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevMin() {
        Radio gaga = new Radio();
        gaga.setCurrentStation(0);

        gaga.prev();

        int expected = 9;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevBeforeMin() {
        Radio gaga = new Radio();
        gaga.setCurrentStation(1);

        gaga.prev();

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevBeforeMax() {
        Radio gaga = new Radio();
        gaga.setCurrentStation(8);

        gaga.prev();

        int expected = 7;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevMiddle() {
        Radio gaga = new Radio();
        gaga.setCurrentStation(5);

        gaga.prev();

        int expected = 4;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolueLessMin() {
        Radio volue = new Radio();
        volue.setCurrentVolume(-1);

        volue.turnUpVolume();

        int expected = 0;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolueMoreMax() {
        Radio volue = new Radio();
        volue.setCurrentVolume(11);

        volue.turnUpVolume();

        int expected = 10;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolueMax() {
        Radio volue = new Radio();
        volue.setCurrentVolume(10);

        volue.turnUpVolume();

        int expected = 10;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolueMin() {
        Radio volue = new Radio();
        volue.setCurrentVolume(0);

        volue.turnUpVolume();

        int expected = 1;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolueBeforeMin() {
        Radio volue = new Radio();
        volue.setCurrentVolume(1);

        volue.turnUpVolume();

        int expected = 2;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolueBeforeMax() {
        Radio volue = new Radio();
        volue.setCurrentVolume(9);

        volue.turnUpVolume();

        int expected = 10;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolueMiddle() {
        Radio volue = new Radio();
        volue.setCurrentVolume(5);

        volue.turnUpVolume();

        int expected = 6;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolueMax() {
        Radio volue = new Radio();
        volue.setCurrentVolume(10);

        volue.turnDownVolume();

        int expected = 9;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolueMin() {
        Radio volue = new Radio();
        volue.setCurrentVolume(0);

        volue.turnDownVolume();

        int expected = 0;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolueBeforeMax() {
        Radio volue = new Radio();
        volue.setCurrentVolume(9);

        volue.turnDownVolume();

        int expected = 8;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolueBeforeMin() {
        Radio volue = new Radio();
        volue.setCurrentVolume(1);

        volue.turnDownVolume();

        int expected = 0;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolueMiddle() {
        Radio volue = new Radio();
        volue.setCurrentVolume(5);

        volue.turnDownVolume();

        int expected = 4;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolueMoreMax() {
        Radio volue = new Radio();
        volue.setCurrentVolume(11);

        volue.turnDownVolume();

        int expected = 10;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolueLessMin() {
        Radio volue = new Radio();
        volue.setCurrentVolume(-1);

        volue.turnDownVolume();

        int expected = 0;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
