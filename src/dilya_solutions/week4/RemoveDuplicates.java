package dilya_solutions.week4;

public class RemoveDuplicates {
    /*
        Write a return method that can remove the duplicated values from
        String
        Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static String removeDup(String str){
        String result = "";

        for(char each : str.toCharArray()){
           if(!result.contains(each+"")){
               result+=each;

           }

        }return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBBCCCC"));
    }
}
