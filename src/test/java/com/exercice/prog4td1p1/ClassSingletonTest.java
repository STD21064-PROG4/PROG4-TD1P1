package com.exercice.prog4td1p1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassSingletonTest {

    @Test
    public void testSingleton() {
        ClassSingleton instance1 = ClassSingleton.getINSTANCE();
        ClassSingleton instance2 = ClassSingleton.getINSTANCE();

        assertSame(instance1, instance2);

        instance1.setDescription("Nouvelle description");

        assertEquals(instance1.getDescription(), instance2.getDescription());
    }
}


