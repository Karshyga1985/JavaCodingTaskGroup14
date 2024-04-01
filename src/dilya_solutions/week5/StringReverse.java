package dilya_solutions.week5;

public class StringReverse {
    public static void reverseStr(String str){
        String result ="";
        for(int i=str.length()-1; i>=0;i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }
    public static String reverseStr2(String str){
        String result ="";
        for(int i=str.length()-1; i>=0;i--){
            result += str.charAt(i);
        }
        return result;
    }
    public static String reverseWhile(String str){
        String result ="";
        int i = str.length()-1;
        while (i>=0){
            result+=str.charAt(i);
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        reverseStr("java");
        System.out.println(reverseStr2("school"));
        System.out.println(reverseWhile("python"));
    }
}

