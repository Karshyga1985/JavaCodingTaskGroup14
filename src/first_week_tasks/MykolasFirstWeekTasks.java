package first_week_tasks;

public class MykolasFirstWeekTasks {

    public static String identify(int number){
        if (number % 2 == 0){
            return "Even";
        }
        return "Odd";
    }

    public static String identify2(int number){
        return number % 2 == 0 ? "Even": "Odd";

    }

    public static String divide(double number, double divideBy){
        if (divideBy == 0){
            throw new RuntimeException("Cant divide by 0!!");
        }
        String result = number+" / "+ divideBy+ " is ";
        int count = 0;
        while (number >= divideBy){
            count++;
            number -= divideBy;
        }
        return result+count+" end remainder is "+number;


    }


    public static String divide2(int number, int divideBy ) {
        if (divideBy == 0) {
            throw new RuntimeException("Can not divide by 0!!");
        }
        String result = number + " / " + divideBy + " is ";
        int count = 0;
        while (number >= divideBy) {
            count++;
            number -= divideBy;
        }
        return result + count + " with remainder of " + number;
    }



    public static void finra(){
        for(int i = 1; i < 31; i++ ){
            if (i % 15 == 0){
                System.out.println("FINRA");
            } else if (i % 3 == 0){
                System.out.println("FIN");
            }else if (i % 5 == 0){
                System.out.println("RA");
            }else {
                System.out.println(i);
            }
        }
    }

    public static void finra2(int number){
        for(int i = 1; i <= number; i++){
            String str = "";
            if (i % 3 == 0){
                str += "FIN";
            }
            if (i % 5 == 0){
                str += "RA";
            }
            System.out.println(str.isEmpty() ? i : str);
        }
    }









    public static void main(String[] args) {
        System.out.println(identify(5));
        System.out.println(identify2(6));
        System.out.println("-----------------------------");
        System.out.println(divide(3,5));
        System.out.println(divide(8,3));
        System.out.println(divide(10,3));
        System.out.println("-----------------------------");
        System.out.println(divide2(3,5));
        System.out.println(divide2(8,3));
        System.out.println(divide2(6,2));

        System.out.println("-----------------------------");
        finra();
        System.out.println("------------------------------------------");
        finra2(30);

    }



}
