package org.example.CoreLogics;

import java.util.Arrays;

public class IngramString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(isIngram(s1,s2));
    }

    private static boolean isIngram(String s1, String s2) {

        if(s1.length() != s2.length()){
            return false;
        }
            char  [] arr1 = s1.toCharArray();
            char [] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return arr1.equals(arr2);

    }
}
