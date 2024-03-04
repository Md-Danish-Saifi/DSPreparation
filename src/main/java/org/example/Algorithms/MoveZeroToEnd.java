package org.example.Algorithms;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {
        int num = 1;
        int []arr = {1,20,0,0,7,0,0,0,5,4};
        moveZeroToEnd(arr);
        moveNumToEnd(arr,num);
    }

    private static void moveNumToEnd(int[] arr, int num) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }

        }
        for(int a : arr){
            System.out.print(a+" ");
        }
    }


    public static void moveZeroToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0 && arr[j] ==0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if(arr[j] != 0){
                    j++;
                }

        }
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
