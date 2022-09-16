package test.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class exampleTest2 {
    @Test
    void exampleTest22() {
        Assertions.assertTrue(new Random().nextInt()>100);
    }
}