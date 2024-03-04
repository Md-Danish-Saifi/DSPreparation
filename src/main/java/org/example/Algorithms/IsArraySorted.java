package org.example.Algorithms;

public class IsArraySorted {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,9};
        System.out.println("Is array sorted or not "+isArraySorted(arr));
    }

    private static boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]> arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
