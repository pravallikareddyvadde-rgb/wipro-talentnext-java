package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {

        DailyTasks obj = new DailyTasks();

        int[] actual = obj.sortValues(new int[]{5,3,8,1,2});
        int[] expected = {1,2,3,5,8};

        assertArrayEquals(expected, actual);
    }
}