/*
Program: Selection Sort
Author: ghost
Date: 30/10/2017
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SelectionSort {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<N;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0;i<N-1;i++){
            int min_index = i;
            for(int j=i+1;j<N;j++){
                if(arr[j] <= arr[min_index]){
                    min_index = j;
                }

                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp; 
            }
        }

        for(int i=0;i<N;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}