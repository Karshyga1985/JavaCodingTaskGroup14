package mykola_solutions.week6;

public class PasswordValidation {

    //1-String -- Password Validation Task
    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit

    public static void main(String[] args) {
        System.out.println(validatePassword("Password0!"));
        System.out.println(validatePassword2("Password0!"));
    }

    public static String validatePassword(String password) {

        if (password.length() > 6 && !password.contains(" ")) {
            boolean isUpperCase = false;
            boolean isLowerCase = false;
            boolean isSpecialChar = false;
            boolean isDigit = false;
            char[] passwordArr = password.toCharArray();
            for (char each : passwordArr) {
                if (each >= '0' && each <= '9') {
                    isDigit = true;
                } else if (each >= 'a' && each <= 'z') {
                    isLowerCase = true;
                } else if (each >= 'A' && each <= 'Z') {
                    isUpperCase = true;
                } else {
                    isSpecialChar = true;
                }
                if (isUpperCase && isLowerCase && isDigit && isSpecialChar) {
                    return "Password is Secure";
                }
            }
        }
        return "Password NOT Secure!";
    }


    public static boolean validatePassword2(String password) {

        if (password.length() > 6 && !password.contains(" ")) {
            boolean isUpperCase = false;
            boolean isLowerCase = false;
            boolean isSpecialChar = false;
            boolean isDigit = false;
            char[] passwordArr = password.toCharArray();
            for (char each : passwordArr) {
                if (Character.isDigit(each)) {
                    isDigit = true;
                } else if (Character.isLowerCase(each)) {
                    isLowerCase = true;
                } else if (Character.isUpperCase(each)) {
                    isUpperCase = true;
                } else {
                    isSpecialChar = true;
                }
                if (isUpperCase && isLowerCase && isDigit && isSpecialChar) {
                    return true;
                }
            }
        }

        return false;


    }


}
