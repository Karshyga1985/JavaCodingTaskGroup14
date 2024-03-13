package khusan_solutions.week6;

public class PasswordValidation {

    public static void main(String[] args) {

        String str = "qFerfdg@r2ty";
        //System.out.println(str.length());

        System.out.println(isPasswordValid(str));

    }

    public static boolean isPasswordValid(String str){
        if (str.length() < 6 || (str.contains(" "))) {
            return false;
        }

        return isUpperCase(str) && isLowerCase(str) && isCharacter(str) && isDigit(str);
    }
    public static boolean isUpperCase(String str){

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }

        return ( count > 0)? true : false;
    }
    public static boolean isLowerCase(String str){

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }

        return ( count > 0)? true : false;
    }
    public static boolean isCharacter(String str){

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if(!Character.isLetterOrDigit(str.charAt(i))){
                count++;
            }
        }

        return ( count > 0)? true : false;
    }
    public static boolean isDigit(String str){

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }

        return ( count > 0)? true : false;
    }


    /*
    1-String -- Password Validation Task
        1. Write a return method that can verify if a password is valid or not.
        requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */
}
