package org.example.DS;

public class InsersionSortEx {
    public static void main(String[] args) {
        int arr [] = {3,1,32,48,7,94};
        selectionSort(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void selectionSort(int[] arr) {
        for(int i = 1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
