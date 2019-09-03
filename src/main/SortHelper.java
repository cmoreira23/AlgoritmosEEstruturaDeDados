package main;

public final class SortHelper {

    public static void insertionSort(int[] array) {
        int key; int i;
        
        for (int j = 1; j < array.length; j++) {
            key = array[j];
            for (i = j - 1; i >= 0 && array[i] > key; i--) {
                array[i + 1] = array[i];
            }
            array[i + 1] = key;
        }
    }
}