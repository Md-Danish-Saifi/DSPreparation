package org.example.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr [] = {1,5,4,8,6,4,1};
        findDuplicatesWithStream(arr);
        System.out.println(removeDuplicate(arr));

    }

    private static void findDuplicatesWithStream(int [] arr) {
        StringBuilder sb1 = new StringBuilder();
        Arrays.stream(arr).distinct().forEach(e -> sb1.append((char)e));
        System.out.println(sb1);
    }

    private static List<Integer> removeDuplicate(int []arr){
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeating = true;
            for (int j = i; j < arr.length; j++) {
                if(i!=j && arr[i]==arr[j]){
                    isRepeating = false;
                }
            }
            if(isRepeating){
                a.add(arr[i]); // for unique characters in array
//                System.out.println("First non repeating integer is : "+arr[i]);
//                break; //for first non-repeating integer
            }
        }
        return a;
    }
}
