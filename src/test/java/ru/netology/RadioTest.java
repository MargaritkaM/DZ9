package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio gaga = new Radio();
    Radio volue = new Radio();

    @Test
    public void defaultNumberStation() {

        Assertions.assertEquals(0, gaga.getFirstStation());
        Assertions.assertEquals(9, gaga.getLastStation());
        Assertions.assertEquals(10, gaga.getNumberStation());
    }

    @Test
    public void numberStation30() {
        Radio gaga = new Radio(30);

        Assertions.assertEquals(0, gaga.getFirstStation());
        Assertions.assertEquals(29, gaga.getLastStation());
        Assertions.assertEquals(30, gaga.getNumberStation());
    }

    @Test
    public void numberStationMin() {
        Radio gaga = new Radio(1);

        Assertions.assertEquals(0, gaga.getFirstStation());
        Assertions.assertEquals(0, gaga.getLastStation());
        Assertions.assertEquals(1, gaga.getNumberStation());
    }

    @Test
    public void numberStationMax() {
        Radio gaga = new Radio(150);

        Assertions.assertEquals(0, gaga.getFirstStation());
        Assertions.assertEquals(149, gaga.getLastStation());
        Assertions.assertEquals(150, gaga.getNumberStation());
    }

    @Test
    public void shouldSetStationMoreMax() {

        gaga.setCurrentStation(10);

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMoreMaxNumber() {
        Radio gaga = new Radio(150);

        gaga.setCurrentStation(150);

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLessMin() {

        gaga.setCurrentStation(-1);

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLessMinNumber() {
        Radio gaga = new Radio(150);

        gaga.setCurrentStation(-1);

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMin() {

        gaga.setCurrentStation(0);

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMinNumber() {
        Radio gaga = new Radio(150);

        gaga.setCurrentStation(0);

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMax() {

        gaga.setCurrentStation(9);

        int expected = 9;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMaxNumber() {
        Radio gaga = new Radio(150);

        gaga.setCurrentStation(149);

        int expected = 149;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBeforeMax() {

        gaga.setCurrentStation(8);

        int expected = 8;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBeforeMaxNumber() {
        Radio gaga = new Radio(150);

        gaga.setCurrentStation(148);

        int expected = 148;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBeforeMin() {

        gaga.setCurrentStation(1);

        int expected = 1;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBeforeMinNumber() {
        Radio gaga = new Radio(150);

        gaga.setCurrentStation(1);

        int expected = 1;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMiddle() {

        gaga.setCurrentStation(5);

        int expected = 5;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMiddleNumber() {
        Radio gaga = new Radio(150);

        gaga.setCurrentStation(75);

        int expected = 75;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextMiddle() {
        gaga.setCurrentStation(5);

        gaga.next();

        int expected = 6;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextMiddleNumber() {
        Radio gaga = new Radio(100);
        gaga.setCurrentStation(50);

        gaga.next();

        int expected = 51;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextMin() {
        gaga.setCurrentStation(0);

        gaga.next();

        int expected = 1;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextMinNumber() {
        Radio gaga = new Radio(100);
        gaga.setCurrentStation(0);

        gaga.next();

        int expected = 1;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextMax() {
        gaga.setCurrentStation(9);

        gaga.next();

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextMaxNumber() {
        Radio gaga = new Radio(100);
        gaga.setCurrentStation(99);

        gaga.next();

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextBeforeMin() {
        gaga.setCurrentStation(1);

        gaga.next();

        int expected = 2;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextBeforeMinNumber() {
        Radio gaga = new Radio(100);
        gaga.setCurrentStation(1);

        gaga.next();

        int expected = 2;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextBeforeMax() {
        gaga.setCurrentStation(8);

        gaga.next();

        int expected = 9;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationNextBeforeMaxNumber() {
        Radio gaga = new Radio(100);
        gaga.setCurrentStation(98);

        gaga.next();

        int expected = 99;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevMax() {
        gaga.setCurrentStation(9);

        gaga.prev();

        int expected = 8;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevMaxNumber() {
        Radio gaga = new Radio(5);
        gaga.setCurrentStation(4);

        gaga.prev();

        int expected = 3;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevMin() {
        gaga.setCurrentStation(0);

        gaga.prev();

        int expected = 9;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevMinNumber() {
        Radio gaga = new Radio(5);
        gaga.setCurrentStation(0);

        gaga.prev();

        int expected = 4;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevBeforeMin() {
        gaga.setCurrentStation(1);

        gaga.prev();

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevBeforeMinNumber() {
        Radio gaga = new Radio(5);
        gaga.setCurrentStation(1);

        gaga.prev();

        int expected = 0;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevBeforeMax() {
        gaga.setCurrentStation(8);

        gaga.prev();

        int expected = 7;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevBeforeMaxNumber() {
        Radio gaga = new Radio(5);
        gaga.setCurrentStation(3);

        gaga.prev();

        int expected = 2;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevMiddle() {
        gaga.setCurrentStation(5);

        gaga.prev();

        int expected = 4;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationPrevMiddleNumber() {
        Radio gaga = new Radio(5);
        gaga.setCurrentStation(2);

        gaga.prev();

        int expected = 1;
        int actual = gaga.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolumeLessMin() {
        volue.setCurrentVolume(-1);

        volue.turnUpVolume();

        int expected = 0;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolumeMoreMax() {
        volue.setCurrentVolume(101);

        volue.turnUpVolume();

        int expected = 100;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolumeMax() {
        volue.setCurrentVolume(100);

        volue.turnUpVolume();

        int expected = 100;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolumeMin() {
        volue.setCurrentVolume(0);

        volue.turnUpVolume();

        int expected = 1;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolumeBeforeMin() {
        volue.setCurrentVolume(1);

        volue.turnUpVolume();

        int expected = 2;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolumeBeforeMax() {
        volue.setCurrentVolume(99);

        volue.turnUpVolume();

        int expected = 100;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePlusVolumeMiddle() {
        volue.setCurrentVolume(50);

        volue.turnUpVolume();

        int expected = 51;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolumeMax() {
        volue.setCurrentVolume(100);

        volue.turnDownVolume();

        int expected = 99;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolumeMin() {
        volue.setCurrentVolume(0);

        volue.turnDownVolume();

        int expected = 0;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolumeBeforeMax() {
        volue.setCurrentVolume(99);

        volue.turnDownVolume();

        int expected = 98;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolumeBeforeMin() {
        volue.setCurrentVolume(1);

        volue.turnDownVolume();

        int expected = 0;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolumeMiddle() {
        volue.setCurrentVolume(50);

        volue.turnDownVolume();

        int expected = 49;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolumeMoreMax() {
        volue.setCurrentVolume(101);

        volue.turnDownVolume();

        int expected = 100;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeMinusVolumeLessMin() {
        volue.setCurrentVolume(-1);

        volue.turnDownVolume();

        int expected = 0;
        int actual = volue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

