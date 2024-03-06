package khusan_solutions.week5;

public class StringFindUnique {
    public static void main(String[] args) {

        //String unique = "AAABBBCCCDEF";
        System.out.println(unique("AAABBBCCCDEFTW"));
        System.out.println(unique("AAABBBCCCDQEEFTWAL"));

    }

    public static String unique(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

            if(count == 1){
                result += str.charAt(i);
            }
        }
        return result;
    }
}


/*
    String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */