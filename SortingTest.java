/*
Progarm: Selection Sort Test
Author: ghost
Date: 30/10/2017
*/

import java.io.IOException;

public class SortingTest {
    public static void main(String args[]) throws IOException {
        // SelectionSortClass sc = new SelectionSortClass();
        // sc.setElementSize(5);
        // sc.setElements();
        // System.out.println("\nBefore Sort");
        // sc.showElements();
        // sc.selectionSort();
        // System.out.println("\nAfter Sort");
        // sc.showElements();

        SortingClass sc;
        // sc = new SelectionSortClass();
        // sc = new BubbleSortClass();
        // sc = new InsertionSortClass();
        // sc = new MergeSortClass();
        sc = new QuickSortClass();
        sc.setElementSize();
        sc.setElements();
        System.out.println("\nBefore Sort");
        sc.showElements();
        // sc.selectionSort();
        // sc.bubbleSort();
        // sc.insertionSort();
        // sc.mergeSort();
        sc.quickSort();
        System.out.println("\nAfter Sort");
        sc.showElements();

    }
}