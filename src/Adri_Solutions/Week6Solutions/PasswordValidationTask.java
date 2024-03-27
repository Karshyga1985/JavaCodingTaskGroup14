package Adri_Solutions.Week6Solutions;

import java.sql.SQLOutput;

public class PasswordValidationTask {

    public static void main(String[] args) {


        System.out.println(PasswordIsValid("True34?"));
        System.out.println(PasswordIsValid("false89?"));
        System.out.println(PasswordIsValid("False89"));
        System.out.println(PasswordIsValid("False?"));
        System.out.println(PasswordIsValid("FALSE"));
        System.out.println(PasswordIsValid("FALSE8"));
        System.out.println(PasswordIsValid("FALSE?"));
        System.out.println(PasswordIsValid("false?"));
        System.out.println(PasswordIsValid("false9"));
        System.out.println(PasswordIsValid("988756376?"));
        System.out.println(PasswordIsValid("94873975"));
        System.out.println(PasswordIsValid("#$%^%&^)_("));

    }

    public static boolean PasswordIsValid(String password){

        if (password.length() > 6 && !password.contains(" ")){



                boolean isUpperCase = false;
                boolean isLowerCase = false;
                boolean isSpecialChar = false;
                boolean isDigit = false;


                char[] arr = password.toCharArray();

                for (char each : arr) {

                    if (each >= 'A' && each <= 'Z') {
                        isUpperCase = true;
                    } else if (each >= 'a' && each <= 'z') {
                        isLowerCase = true;
                    } else if (each >= '0' && each <= '9') {
                        isDigit = true;
                    } else {
                        isSpecialChar = true;
                    }

                    if (isDigit && isLowerCase && isUpperCase && isSpecialChar) {
                        return true;
                    }
                }

        }
        return false;

    }



}


//1-String -- Password Validation Task
//1. Write a return method that can verify if a password is valid or not.
//requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//
//if all requirements above are met, the method returns true, otherwise returns false