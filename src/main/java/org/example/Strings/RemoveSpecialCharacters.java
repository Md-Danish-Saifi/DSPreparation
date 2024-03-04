package org.example.Strings;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
//        Remove special characters
        String str1 = "D@a#n*i^%s%^&h*(";
        System.out.println(str1.replaceAll("[^a-zA-Z0-9]",""));

//        remove white spaces
        String str2 = " D   a  n  i s  h    ";
        System.out.println(str2.replaceAll("\\s",""));

        //        remove number
        String str3 = "D1a2n3i4s5h6";
        System.out.println(str3.replaceAll("[^a-zA-Z]",""));

        //        remove characters
        String str4 = "D1a2n3i4s5h6";
        System.out.println(str4.replaceAll("[^0-9]",""));

//        remove duplicates from string
        String name = "DAANISSHHHHHH";
        StringBuilder sb = new StringBuilder();
        name.chars().distinct().forEach(c-> sb.append((char) c));
        System.out.println(sb);


    }
}
