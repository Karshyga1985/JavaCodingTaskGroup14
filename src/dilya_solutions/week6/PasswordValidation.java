package dilya_solutions.week6;

public class PasswordValidation {
    public static boolean validPassword(String password){
        while(!password.isBlank()&&!password.isEmpty()){
            if(password.length()<7 || password.contains(" ")) {
                return false;
            }
            int upperCaseCount = 0, lowerCaseCount=0, special=0, digit=0;
            for(char each : password.toCharArray()){
                if(Character.isUpperCase(each)){
                    upperCaseCount++;
                }
                if(Character.isLowerCase(each)){
                    lowerCaseCount++;
                }
                if(Character.isDigit(each)){
                    digit++;
                }
                if(!Character.isDigit(each)&&!Character.isLetter(each)){
                    special++;
                }
            }
            if(upperCaseCount<1 && lowerCaseCount<1 && digit<1 && special<1){
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validPassword("Cyde"));
        System.out.println(validPassword("Cydeo1"));
        System.out.println(validPassword("Cydeo1!"));
    }
}
