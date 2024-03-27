package mykola_solutions.week5;

import java.util.*;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
        System.out.println(reverse2("ABCD"));
        System.out.println(reverse3("ABCD"));


    }


    public static String reverse(String str){
        String str2 = "";
        for (int i = str.length()-1; i >= 0; i--) {
            str2 += str.charAt(i);
        }

        return str2;

    }

    public static String reverse2(String str) {
        String str2 = "";
       Stack<Character> list = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
           list.add(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
          str2 += list.pop();
        }
        return str2;



    }

    public static String reverse3(String str) {
        return  new StringBuilder(str).reverse().toString();
    }
}
