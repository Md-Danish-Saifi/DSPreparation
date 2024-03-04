package org.example.Algorithms;

public class LeniarSearch {
    public static void main(String[] args) {
        int num = 10;
        int arr [] = {67,98,76,4,34,10};
        isNumPresent(arr,num);
    }

    private static void isNumPresent(int[] arr, int num) {
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == num){
                System.out.println("number "+num +" is present at "+i+"th index");
                break;
            }
        }
    }

}
