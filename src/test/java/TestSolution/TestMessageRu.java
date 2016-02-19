package TestSolution;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;


import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
 * Created by Олег on 16.02.2016.
 */
public class TestMessageRu {

    @BeforeClass
    public static void chengeLocalRU(){
        Locale.setDefault(new Locale("RU"));
    }


    @Test
    public void test1(){
        assertEquals("Вывод не корректный","Добрый вечер, Мир!", HelloWorld.getMessage(21));
    }

    @Test
    public void test2(){
        assertEquals("Вывод не корректный","Доброе утро, Мир!", HelloWorld.getMessage(7));
    }

    @Test
    public void test3(){
        assertEquals("Вывод не корректный","Добрый день, Мир!", HelloWorld.getMessage(14));
    }

    @Test
    public void test4(){
        assertEquals("Вывод не корректный","Спокойной ночи, Мир!", HelloWorld.getMessage(1));
    }
}
