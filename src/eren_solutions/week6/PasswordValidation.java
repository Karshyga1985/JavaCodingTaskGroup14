package eren_solutions.week6;

import java.util.Scanner;

public class PasswordValidation {
    /*
    1-String -- Password Validation Task
        1. Write a return method that can verify if a password is valid or not.

        Requirements:

        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit

        If all requirements above are met, the method returns true, otherwise returns false
     */
    public static void main(String[] args) {

        System.out.println(isPasswordValid("Ce$9eq")); // 6 character valid
        System.out.println(isPasswordValid("crA@9")); // 5 character invalid
        System.out.println(isPasswordValid("dfd#9dss")); // missing uppercase invalid
        System.out.println(isPasswordValid("SASS9*#!5")); // missing lowercase invalid
        System.out.println(isPasswordValid("AJAKelk#^&*")); // missing digit

    }


    public static String isPasswordValid(String password) {

        int min = 6;
        int max = 16;
        int digit = 0;
        int specialCharacter = 0;
        int upperLetterCount = 0;
        int lowerLetterCount = 0;


//        Scanner scan = new Scanner(System.in);
//        System.out.println(" Enter Your Password:");
//        password = scan.nextLine();
        // If we want we can make our code more dynamic, and user interactive by using a scanner object here.
        if(password.length() >= min && password.length() <= max){

            for(int i = 0; i < password.length(); i++){

                char ch = password.charAt(i);

                if(Character.isUpperCase(ch)){
                    upperLetterCount++;
                }
                if(Character.isLowerCase(ch)){
                    lowerLetterCount++;
                }
                if(Character.isDigit(ch)){
                    digit++;
                }
                if(ch>= 33 && ch <= 46 || ch == 64){
                    specialCharacter++;
                }
            }
            if(specialCharacter >= 1 && lowerLetterCount >= 1 && upperLetterCount >= 1 && digit >= 1){
                return  " Password is valid" ;
            }else{

                System.out.println("Password is invalid !!!");
                System.out.println(" Password must be at least "+ min +" characters:");
                System.out.println(" You need at least one upper case character:");
                System.out.println(" You need at least one digit:");
                System.out.println(" You need at least one special character:");
            }

        }

        if(password.length() < min){

            for(int i = 0 ; i < password.length(); i++){
                char ch = password.charAt(i);
                if(Character.isLowerCase(ch) ){
                    lowerLetterCount++;
                }
            }

            if(lowerLetterCount > 0){
                System.out.println(" Password must be at least "+ min +" characters:");
                System.out.println(" You need at least one upper case character:");
                System.out.println(" You need at least one digit:");
                System.out.println(" You need at least one special character:");



            }
        }
        else if(password.length() < min && upperLetterCount > 1){

            for(int i = 0 ; i < password.length(); i++){

                char ch = password.charAt(i);
                if(Character.isLowerCase(ch)){
                    lowerLetterCount++;
                }
                if(Character.isUpperCase(ch)){
                    upperLetterCount++;
                }
            }
            if(lowerLetterCount > 0 && upperLetterCount > 0){
                System.out.println(" Password must be at least "+min+" chracters:");
                System.out.println(" You need at least one digit:");
                System.out.println(" You need at least one special character:");
            }
        }
        if(password.length() > max || password.length() >= max && upperLetterCount > 1 && lowerLetterCount > 1 && digit > 1){
            System.out.println(" Password is too long. Limit is "+max+" chracters:");
            System.out.println(" You need at least one special character:");

        }
        if(password.length()>=min && password.length() <= max && lowerLetterCount > 0 && upperLetterCount > 0 && digit > 0 && specialCharacter == 0){
            System.out.println(" You need at least a special character");
        }
        if(password.length() >= min&&password.length() <= max && lowerLetterCount > 0 && upperLetterCount > 0 && digit == 0 && specialCharacter == 0){
            System.out.println(" You need at least one digit:");
            System.out.println(" You need at least one special character:");
        }

        return password;
    }
}

