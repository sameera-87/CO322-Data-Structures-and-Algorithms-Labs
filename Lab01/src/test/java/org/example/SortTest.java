package org.example;

import static org.example.Sort.bubble_sort;
import static org.example.Sort.create_rand_data;
import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void bubble_sortRandomDataTest(){
        int[] array = create_rand_data(10);
        bubble_sort(array);
        Assertions.ass
    }


}