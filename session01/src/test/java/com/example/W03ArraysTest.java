package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class W03ArraysTest {
    private static final int[] WITHOUT_DUPLICATES = new int[] {1, 2, 3, 4, 5};
    private static final int[] WITH_DUPLICATES = new int[] {1, 2, 3, 4, 1};

    @Test
    public void testArrayWithoutDuplicates() {
        boolean result = W03Arrays.containsDuplicate(WITHOUT_DUPLICATES);
        assertFalse(result);
    }

    @Test
    public void testArrayWithDuplicates() {
        boolean result = W03Arrays.containsDuplicate(WITH_DUPLICATES);
        assertTrue(result);
    }
}
