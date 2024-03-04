package org.example.DS;

public class SelectionSortEx {
    public static void main(String[] args) {
        int []arr = {6,54,468,48,46,46,84};
        selectionSort(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    static void selectionSort(int[] arr) {

        for(int i = 0;i<arr.length;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest] >arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
