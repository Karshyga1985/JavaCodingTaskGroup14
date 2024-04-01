package christine_solutions.week5;

public class String_FindUnique {
    /*
    String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";
*/

    public static void main(String[] args) {

        System.out.println("findUnique(\"baby\") = " + findUnique("baby"));
        System.out.println("findUnique2(\"happiness\") = " + findUnique2("happiness"));

    }

    public static String findUnique2(String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char each = str.charAt(i);

            if ( !(unique.contains(each + "")) ){
                for (int j = 0; j < str.length(); j++) {
                    if (each == str.charAt(j)){
                        count++;
                    }
                }
                if (count == 1){
                    unique += each;
                }
            }

        }

        return unique;
    }

    public static String findUnique(String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)){
                unique += each;
            }

        }


        return unique;
    }

}
