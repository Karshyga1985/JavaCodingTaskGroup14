package christine_solutions.week6;

public class passwordValidationTask {

    public static void main(String[] args) {

        System.out.println("validPassword(\"Christine@123\") = " + validPassword("Christine@123"));

        System.out.println("validPassword(\"christine123\") = " + validPassword("christine123"));

        System.out.println("validPassword(\"christine\") = " + validPassword("christine"));

        System.out.println("validPassword(\"chris\") = " + validPassword("chris"));


    }


    public static boolean validPassword(String password){

        boolean oneUppercase = false,
                oneLowercase = false,
                oneDigit = false,
                oneSpecialChar = false;

        if (password.length() <= 5){
            return false;
        }else{

            for (int i = 0 ; i < password.length(); i ++){
                if(Character.isUpperCase(password.charAt(i))){
                    oneUppercase = true;
                }
                if(Character.isLowerCase(password.charAt(i))){
                    oneLowercase = true;
                }
                if(  !(Character.isLetterOrDigit(password.charAt(i)))  ){
                    oneSpecialChar = true;
                }
                if(Character.isDigit(password.charAt(i))){
                    oneDigit = true;
                }
            }


            if(oneUppercase == true && oneLowercase == true && oneSpecialChar == true && oneDigit == true){
                return true;
            } else {
                return false;
            }

        }

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