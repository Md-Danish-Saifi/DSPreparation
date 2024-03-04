package org.example.Algorithms;

public class MissingNumber {
    public int getMissingNumberWithSum(int arr[]){
        int sum1 = 0;
        for (int i=0;i< arr.length;i++){
            sum1 += arr[i];
        }
        int sum2 = 0;
        for (int i=1;i<=6;i++){
            sum2 = sum2+i;
        }
        System.out.println("sum1 "+sum1 +" sum2 "+sum2);
        return sum2-sum1;
    }
    public int getMissingNumberWithTempArr(int arr[]){

        int i;
        int N = arr.length;
        int temp[] = new int[N + 1];

        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }
//int arr[] = {1,2,3,5,6};

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;

//int temp[] = {1,1,1,0,1,1};
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        return ans;
    }
}