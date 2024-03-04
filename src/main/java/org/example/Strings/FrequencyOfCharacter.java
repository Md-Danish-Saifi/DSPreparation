package org.example.Strings;

import java.util.*;

public class FrequencyOfCharacter {

        public static void main(String[] args) {
            String inputString = "Hello, World!";
            Map<Character, Integer> frequencyMap = countCharacterFrequency(inputString);
            countFriquency("helloWorld");
            // Display the frequency of each character
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }

        public static Map<Character, Integer> countCharacterFrequency(String input) {
            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Convert the input string to char array
            char[] charArray = input.toCharArray();

            // Iterate through each character and update the frequency in the map
            for (char ch : charArray) {
                if (Character.isLetterOrDigit(ch)) {
                    frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
                }
            }

            return frequencyMap;
        }


        public static void countFriquency( String chars){
            LinkedHashMap<Character,Integer> data = new LinkedHashMap<>() {
            };
            char arr [] = chars.toCharArray();
            for(int h = 0;h< arr.length;h++){
                int count = 0;
                for(int i = 0;i< arr.length;i++){
                    if(arr[h] == arr[i]){
                        count++;
                    }
                }
                data.put(arr[h],count);
            }
            for(Map.Entry<Character,Integer> d : data.entrySet()){
                System.out.println(d.getKey()+" - "+d.getValue());

            }
        }
}


