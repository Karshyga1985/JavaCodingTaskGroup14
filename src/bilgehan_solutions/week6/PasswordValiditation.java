package bilgehan_solutions.week6;

public class PasswordValiditation {
    public static void main(String[] args) {

    }

    public static boolean isValidPassword(String password){
        if(password.length() < 6 && password.contains(" ")){
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)){
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }else if(!Character.isLetterOrDigit(ch)){
                hasSpecialChar = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }
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