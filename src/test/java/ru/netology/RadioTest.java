package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio gaga = new Radio();

        Assertions.assertEquals(0, gaga.getFirstStation());
        Assertions.assertEquals(9, gaga.getLastStation());
        Assertions.assertEquals(10, gaga.getNumberStation());
    }
    @Test
    public void test1() {
        Radio gaga = new Radio(30);

        Assertions.assertEquals(0, gaga.getFirstStation());
        Assertions.assertEquals(29, gaga.getLastStation());
        Assertions.assertEquals(30, gaga.getNumberStation());
    }
    @Test
    public void test2() {
        Radio gaga = new Radio(1);

        Assertions.assertEquals(0, gaga.getFirstStation());
        Assertions.assertEquals(0, gaga.getLastStation());
        Assertions.assertEquals(1, gaga.getNumberStation());
    }
    @Test
    public void test3() {
        Radio gaga = new Radio(150);

        Assertions.assertEquals(0, gaga.getFirstStation());
        Assertions.assertEquals(149, gaga.getLastStation());
        Assertions.assertEquals(150, gaga.getNumberStation());
    }
}

