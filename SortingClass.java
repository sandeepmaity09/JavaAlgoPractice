/*
Program : Base Sorting Class For Getting & Setting Data
Author: ghost
Date: 30/10/2017
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

abstract class SortingClass {
    protected int N;
    protected int arr[];
    protected BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public void setElementSize() throws IOException {
        System.out.println("Enter Number of Elements : ");
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
    }

    public void setElementSize(int num) {
        N = num;
        arr = new int[N];
    }

    public void setElements() throws IOException {
        System.out.println("Enter " + N + " elements one by one");
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public void showElements(){
        for(int i=0;i<N;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void selectionSort(){};
    public void bubbleSort(){};
    public void insertionSort(){};
    public void mergeSort(){};
    public void quickSort(){};
}