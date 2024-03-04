package org.example.Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        int arr [] =  {10,15,8,9,100,12};
        int n = 5;
        Arrays.sort(arr);
        System.out.println(n+"th largest number is : "+arr[arr.length-n]);
        getNthLargestNumber(arr,n);
        getNthLargestNumberWithoutSort(arr,n);
    }
    public static void getNthLargestNumber(int arr[],int n){
            int [] array = arr;

//            using bubble sort
            for(int i = 0;i< array.length; i++){
                for(int j = i+1;j< array.length;j++){
                    if(array[i]>array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

                System.out.println(n+"th largest number is : "+array[array.length-n]);

    }
    public static void getNthLargestNumberWithoutSort(int arr[],int n){
        int largest = arr[0];
        int nThLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> largest){
                nThLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > nThLargest) {
                nThLargest = arr[i];
            }
        }
        System.out.println("Second largest number is : "+nThLargest);
    }
}
