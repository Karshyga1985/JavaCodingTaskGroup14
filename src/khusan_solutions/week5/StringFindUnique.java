package khusan_solutions.week5;

public class StringFindUnique {
    public static void main(String[] args) {

        //String unique = "AAABBBCCCDEF";
        unique("AAABBBCCCDEF");


    }

    public static void unique(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            if( ! (result.contains(""+str.charAt(i)) ) ){

                for (int j = 0; j < str.length(); j++) {

                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                result += "" + str.charAt(i)+count;

                if(count == 1){
                    System.out.print(str.charAt(i));
                }
            }
        }
        //System.out.println(result);
    }

}


/*
    String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */