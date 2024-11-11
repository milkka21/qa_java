package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        int actualKittensCount = lion.getKittens();
        int expectedKittensCount = 3;
        assertEquals("Это не наши котята", expectedKittensCount, actualKittensCount);

    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expectedHaveMane = true;
        boolean actualHaveMane = lion.doesHaveMane();
        assertEquals("Cамка не самец", actualHaveMane, expectedHaveMane);
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        assertEquals("Самец питается не правильно", expected, actual);
    }
        @Test
        public void doesHaveManeThrowsExceptionTest() {
            try {
                Lion lion = new Lion("Котик", feline);
            } catch (Exception exception) {
                String textException = "Используйте допустимые значения пола животного - самец или самка";
                Assert.assertEquals(textException, exception.getMessage());
            }
    }
}