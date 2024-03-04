package org.example.Strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "HelloWorld";
        findDuplicatesWtihStream(str);
        findDuplicatesWithIndexOf(str);

    }

    private static void findDuplicatesWithIndexOf(String str) {
        StringBuilder sb1 = new StringBuilder();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int index = str.indexOf(c,i+1);
            if(index == -1){
                sb1.append(c);
            }
        }
        System.out.println(sb1);
    }


    private static void findDuplicatesWtihStream(String str) {
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(e -> sb1.append((char)e));
        System.out.println(sb1);
    }
}
