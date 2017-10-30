/*
Program: Merge Sort Algorithm Implementation
Author: ghost
Date: 30/10/2017
*/

class MergeSortClass extends SortingClass {
    public void merge(int left,int mid,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int A1[] = new int[n1];
        int A2[] = new int[n2];
        
        for(int i=0;i<n1;i++)
            A1[i] = arr[left+i];
        for(int j=0;j<n2;j++)
            A2[j] = arr[mid+j+1];
        
        int i=0,j=0,k=left;
        
        while( i < n1 && j < n2){
            if(A1[i] <= A2[j]){
                arr[k] = A1[i];
                i++;
            } else {
                arr[k] = A2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = A1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = A2[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int left,int right){
     if(left<right){
         int mid = (right + left)/2;
         mergeSort(left,mid);
         mergeSort(mid+1,right);
         merge(left,mid,right);
     }   
    }

    public void mergeSort(){
        mergeSort(0,N-1);
    }
}