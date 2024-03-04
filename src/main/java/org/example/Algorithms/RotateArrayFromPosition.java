package org.example.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayFromPosition {

  public List<Integer> rightRotate(int[] arr, int l, int k) {
    int temp [] = new int[arr.length];
    k = k % l;
//    3%5;
    for (int i = 0; i < l; i++) {
      if (i < k) {
        temp[i] = arr[l + i - k];
//        {1,2,3,5,6}
//        arr[5+2-3]
//        temp = {3,5,6}
      } else {
        temp[i] = arr[i-k];
//         {1,2,3,5,6}
//        arr[4-3]
//        temp = {3,5,6,1,2}
      }
    }
    List<Integer> lst = new ArrayList<>();
    Arrays.stream(temp).forEach(e-> lst.add(e));
    return lst;
  }
}
