/*
Program : Bubble Sort Algorithm Implementation
Author: ghost
Date: 30/10/2017
*/

class BubbleSortClass extends SortingClass {
    public void bubbleSort(){
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}