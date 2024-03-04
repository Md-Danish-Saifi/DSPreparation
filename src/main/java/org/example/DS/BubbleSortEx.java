package org.example.DS;

public class BubbleSortEx {
    public static void main(String[] args) {
    int [] arr = {10,12,15,2,5,8,10};
    bubbleSort(arr);
    for (int i : arr){
        System.out.println(i+"");
    }
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0 ;i< arr.length;i++){
//            avoiding sorted element with length-i-1
            for(int j = 0;j<arr.length-i-1;j++){
//                checking next element from current element is greater or not
                if(arr[j] > arr[j+1]){
//                    swapping current element with next element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
