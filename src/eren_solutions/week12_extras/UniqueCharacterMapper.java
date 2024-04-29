package eren_solutions.week12_extras;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacterMapper {


/*
Map -- Unique character from String

Take the unique characters of a String and save them into a map. Like {d=1,e=1} so
keys will be unique letters values will be 1

*/


    public static Map<Character, Integer> mapUniqueCharacters(String input){
        Map<Character, Integer> characterMap = new HashMap<>();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Check if the character is already present in the map
            if (characterMap.containsKey(ch)) {
                // If present, increment its count
                int count = characterMap.get(ch);
                characterMap.put(ch, count + 1);
            } else {
                // If not present, add it with a count of 1
                characterMap.put(ch, 1);
            }
        }

        return characterMap;
    }

    public static void main(String[] args) {

        String input = "example"; // Example string
        Map<Character, Integer> uniqueCharacterMap = mapUniqueCharacters(input);

        // Print the unique character map
        System.out.println("Unique character map:");
        System.out.println(uniqueCharacterMap);


        /*
        This code defines a method mapUniqueCharacters that takes a string as input and returns a map where each unique character of the string is a key, and the value associated with each key is the count of occurrences of that character in the string. The main method demonstrates how to use this method.
        */

    }

}

