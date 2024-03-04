package org.example.Strings;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Ahmad"; //lethals
        String s2 = "Ahmad";

        String s3 = new String("Ahmad");

        System.out.println(s1.equals(s2));
        System.out.println(s1 ==s2);

        System.out.println(s1.equals(s3));

        System.out.println(s1 == s3);
    }
}
