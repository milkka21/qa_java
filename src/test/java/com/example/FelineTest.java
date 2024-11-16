package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {


    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals("Кошка питается неправильно", expectedFood, actualFood);

    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("Не правильно определено семейство", expectedFamily, actualFamily);
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        assertEquals("Это не наши котята", expectedKittensCount, actualKittensCount);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int expectedKittensCount = 3;
        int actualKittensCount = feline.getKittens(3);
        assertEquals("Это не наши котята", expectedKittensCount, actualKittensCount);
    }
}