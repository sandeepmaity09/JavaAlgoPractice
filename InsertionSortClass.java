/*
Program: Insertion Sort Algorithm Implementation
Author: ghost
Date: 30/10/2017
*/

class InsertionSortClass extends SortingClass {

    public void insertionSort(){
        for(int i=1;i<N;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}