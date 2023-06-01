package com.exercice.prog4td1p1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassUniqueInstanceTest {

    @Test
    public void testUniqueInstance() {
        ClassUniqueInstance instance1 = ClassUniqueInstance.INSTANCE;
        ClassUniqueInstance instance2 = ClassUniqueInstance.INSTANCE;

        assertSame(instance1, instance2);

        instance1.setClick(5);

        assertEquals(instance1.getClick(), instance2.getClick());
    }
}

