/*
Program : Quick Sort Algorithm Implementation
Author: ghost
Date: 30/10/2017
*/

class QuickSortClass extends SortingClass {
    int partition(int low,int high){
        System.out.println("Partition Called");
        int pivot = arr[high];
        int i = (low-1);
        for(int j=low;j<high;j++){
            if(arr[j] <= pivot){
                i++;
                // System.out.println(arr[i]);
                // showElements();
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                showElements();
                System.out.println(i + " " + j);
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void quickSort(int low,int high){
        System.out.println("Sorting Called");
        if(low<high){
            int pi = partition(low,high);
            System.out.println(pi);
            quickSort(low,pi-1);
            quickSort(pi+1,high);
        }
    }

    public void quickSort(){
        quickSort(0,N-1);
    }
}