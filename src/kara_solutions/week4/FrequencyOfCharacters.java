package kara_solutions.week4;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
        System.out.println("freqOfChar(\"AAABBCDD\") = " + freqOfChar("AAABBCDD")); //A5B3C1D3
    }

    public static String frequencyOfChars(String str){

        // solution 1
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if(result.contains("" + str.charAt(i))){
                continue;
            }
            result += str.charAt(i) + "" + count;
        }
        return result;
    }
    // solution 2

    public static String freqOfChar(String str1){
        String result = "";
        int j = 0;
        while(j < str1.length()){
            int count = 0;
            for(int i = 0; i < str1.length(); i++){
                if(str1.charAt(i) == str1.charAt(j)){
                    count++;
                }
            }
            result += str1.charAt(j) + "" + count;
            str1 = str1.replace("" + str1.charAt(j), "");
        }
        return result;
    }
}
/*
        Write a return method that can find the frequency of
        characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */