/*
Program: Selection Sort Algorithm Implementation
Author: ghost
Date: 30/10/2017
*/

class SelectionSortClass extends SortingClass {

    public void selectionSort(){
        for(int i=0;i<N-1;i++){
            int minIndex = i;
            for(int j=i+1;j<N;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}