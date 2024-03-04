package org.example.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class SumOfString {
    public static int sumOfString(String str1,String str2){
        int a = Integer.valueOf(str1);
        int b = Integer.valueOf(str2);
        return a+b;
    }
    public static String reverseString (String str){
        String nullStr = "";
        for (int i = str.length()-1;i >= 0;i--){
            nullStr = nullStr+str.charAt(i);
        }
        return nullStr;
    }
   public static String reverseStringWithFun(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return String.valueOf(sb.reverse());
    }

    public static String reverseStringWithBuffer(String string){

        StringBuffer sb = new StringBuffer(string);
        sb.reverse();
        return String.valueOf(sb);
    }
    public static String revStringChar(String str){
        String rev = "";
        char [] arr = str.toCharArray();
        for(int i = arr.length-1;i>=0;i--){
            rev = rev+arr[i];
        }
        return rev;
    }
    public static String revStringUsingSwap(String str){
        String rev = "";
        char [] arr = str.toCharArray();
        int left, right = 0;
        right = arr.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        for(char ch : arr){
            rev = rev+ch;
        }
        return rev;
    }

    public static String revStringUsingReverse(String str){
        String rev = "";
        char [] arr = str.toCharArray();
        List<Character> name = new ArrayList<>();
        for(char ch : arr){
            name.add(ch);
        }
        Collections.reverse(name);
        ListIterator li = name.listIterator();
        while (li.hasNext()){
            rev = rev+li.next();
        }
        return rev;
    }
    public static void capitalizeFirstLatter(){
        String arr[] = {"d  anNish","Jyoti","",null,"farhAN","shaHrukh"};
        String cmbn = "";
        for(String str : arr){
           if( str != null && !str.isBlank() && !str.isEmpty() ) {
               String name = str.toLowerCase();
               if(cmbn.isBlank())
                   cmbn = name.substring(0, 1).toUpperCase() + name.substring(1);
               else
                   cmbn = cmbn.concat("-"+name.substring(0, 1).toUpperCase() + name.substring(1));
           }
        }
        System.out.println(cmbn);
    }
    public static void main(String[] args) {
        System.out.println(sumOfString("1","20"));
        System.out.println("Reversing string is "+reverseString("Danish"));
        System.out.println("Reverse string with builder "+reverseStringWithFun("Nitin"));
        capitalizeFirstLatter();
        System.out.println("Reversing string with builtin function "+reverseStringWithFun("Danish"));
        System.out.println("Reversing string with char  "+revStringChar("Danish"));
        System.out.println("Reversing string with char  "+revStringUsingSwap("Ruchi"));
        System.out.println("Reversing string with list reverse "+revStringUsingReverse("Nitu"));
        System.out.println("Reversing string with string buffer "+reverseStringWithBuffer("Shiv"));
    }
}
