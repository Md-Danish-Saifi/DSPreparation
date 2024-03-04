package org.example;

import org.example.DS.LinkedList;

public class Main {
    public static void main(String[] args) {

       /* int arr[] = {1,2,3,5,6};
        MissingNumber m = new MissingNumber();
        RotateArrayFromPosition rap = new RotateArrayFromPosition();
        MaxInArray max = new MaxInArray();

        System.out.println("Missing number is "+m.getMissingNumberWithSum(arr));
        System.out.println("Missing number is "+m.getMissingNumberWithTempArr(arr));
        System.out.println("max number is "+max.getMaxWithStram(arr).getAsInt());
        System.out.println("nth max number is "+max.maxOfPosition(arr,2));
        System.out.println("Rotate Array is "+rap.rightRotate(arr, arr.length, 3));
        System.out.println(arr[5]);*/
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(5);
        ll.add(10);
        ll.add(12);
        ll.printList();
        System.out.println();
        ll.swapPairs();
        ll.printList();

    }
}