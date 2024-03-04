package org.example.DS;

public class QuickSortEx {
    private static void quickSort(int[] arr, int start, int end) {
        if(start<end){
            int pivotIndex = partitionArr(arr,start,end);
            quickSort(arr,start,pivotIndex-1);
            quickSort(arr,pivotIndex+1,end);
        }
    }
    private static int partitionArr(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start-1;
        for (int j = start;j<end;j++){
            if(arr[j]<pivot){
                i++;
//                swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr =  {10,6,51,12,4,3};
        int n = arr.length;
        int start = 0;
        int end = n-1;

        quickSort(arr,start,end);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
