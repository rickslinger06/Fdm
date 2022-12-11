package com.fdmgroup.methods;

import java.util.Arrays;

public class Sort {
	
    public static void main(String[] args) {
        int[] unsortedArray = { 2, 5, 6, 1, 8 };
        System.out.println(Arrays.toString(bubbleSort(unsortedArray)));
    }
    
    public static int[] bubbleSort(int[] array) {
        int countSwaps = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                countSwaps++;
            }
        }
        if (countSwaps != 0) {
            bubbleSort(array);
        }
        return array;
    }
}