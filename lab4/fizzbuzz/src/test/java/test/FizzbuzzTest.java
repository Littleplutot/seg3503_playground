package test;
import static org.junit.jupiter.api.Assertions.assertEquals ;
import org.junit.jupiter.api.Test;

import lib.Fizzbuzz;

public class FizzbuzzTest {
    Fizzbuzz fbConverter = new Fizzbuzz();

    @Test// test que 9 retourne "9"
    void test9(){
        String result = fbConverter.converter(9);
        assertEquals("Fizz",result);
    }

}
