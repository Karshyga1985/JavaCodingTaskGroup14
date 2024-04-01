package kara_solutions.week4;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("removeDup(\"AAABBBCCC\") = " + removeDup("AAABBBCCC"));
        System.out.println("removeDup(\"AAABBBCCCDDDFFFRDDDD\") = " + removeDup("AAABBBCCCDDDFFFRDDDD"));

        System.out.println();

        System.out.println("removeDuplicates(\"AAADDDBBBBBBBRRRRRR\") = " + removeDuplicates("AAADDDBBBBBBBRRRRRR"));
    }

    public static String removeDup(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    result += str.charAt(i) + "";
                    str = str.replace("" + str.charAt(j), "");
                }
            }
        }
        return result;
    }

    public static String removeDuplicates(String str1){
        String result = "";
        int j = 0;
        while (j < str1.length()){
            for (int i = 0; i < str1.length(); i++) {
                if(str1.charAt(j) == str1.charAt(i)){
                    result += str1.charAt(j) + "";
                    str1 = str1.replace("" + str1.charAt(j), "");
                }
            }
            j++;
        }
        return result;
    }


}
/*
        Write a return method that can remove the duplicated values from
        String
        Ex: removeDup("AAABBBCCC") ==> ABC
 */