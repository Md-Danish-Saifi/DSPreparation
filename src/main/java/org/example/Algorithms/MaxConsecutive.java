package org.example.Algorithms;

public class MaxConsecutive {
    public static void main(String[] args) {
        int []arr = {1,1,0,0,1,0,0,0,1,1,1,1,0,1,1,1};
        findMaxConsecutiveOnes(arr);
        findMaxConsecutiveZero(arr);
    }

    private static void findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
            count++;
            } else {
                count = 0;
            }
            max = Math.max(max,count);
        }
        System.out.println("max consecutive ones are "+max);
    }

    private static void findMaxConsecutiveZero(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max,count);
        }
        System.out.println("max consecutive zero are "+max);
    }
}
