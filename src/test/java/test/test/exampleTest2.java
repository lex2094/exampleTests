package test.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class exampleTest2 {
    @Test
    void exampleTest22(){
        Assertions.assertTrue(100>99);
        Assertions.assertTrue(500>99);

    }
    {
        @Test
        void exampleTest23(){
        Assertions.assertTrue(101>99);
        Assertions.assertTrue(999>99);

    }
}
