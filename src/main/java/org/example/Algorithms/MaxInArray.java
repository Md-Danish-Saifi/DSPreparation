package org.example.Algorithms;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxInArray {
    public int getMaxOfArray(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public OptionalInt getMaxWithStram(int[] arr){
        OptionalInt max = Arrays.stream(arr).max();
        return max;
    }
    public int maxOfPosition(int arr[],int pos){

        Arrays.sort(arr);
        int max = arr[arr.length-pos];
        return max;
    }
    public int maxOfPositionWithoutSort(int arr[],int pos){

        int max = 0;
        int temp []= new int[pos];
        for(int j =0;j<pos;j++) {
            int temps = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > temps ) {
                    temps = arr[i];
                }
            }

        }
        return max;
    }

}