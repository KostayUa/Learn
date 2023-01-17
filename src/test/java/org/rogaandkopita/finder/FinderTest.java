package org.rogaandkopita.finder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinderTest {

    @Test
    public void test1() {
        //given
        int[] arr = new int[]{};

        //when
        int result = Finder.find(arr, 5);

        //then
        assertEquals(-1, result);
    }

    @Test
    public void test3() {
        //given
        int[] arr = new int[]{8, 3, 5};

        //when
        int result = Finder.find(arr, 10);

        //then
        assertEquals(-1, result);
    }

    @Test
    public void test2_1() {
        //given
        int[] arr = new int[]{8, 3, 5};

        //when
        int result = Finder.find(arr, 8);

        //then
        assertEquals(0, result);
    }

    @Test
    public void test2_2() {
        //given
        int[] arr = new int[]{8, 3, 5};

        //when
        int result = Finder.find(arr, 5);

        //then
        assertEquals(2, result);
    }

    @Test
    public void test2_3() {
        //given
        int[] arr = new int[]{8, 3, 5};

        //when
        int result = Finder.find(arr, 3);

        //then
        assertEquals(1, result);
    }
}
