package test;
import lib.Fizzbuzz ;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzbuzzTest {
    Fizzbuzz fbConverter = new Fizzbuzz();

    @Test// test que 9 retourne "9"
    void test9(){
        String result = fbConverter.converter(9);
        assertEquals("9",result);
    }

}
