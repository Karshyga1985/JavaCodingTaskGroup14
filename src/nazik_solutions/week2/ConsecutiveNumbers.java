package nazik_solutions.week2;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        consecutiveNumbers(60);
    }

    public static void consecutiveNumbers(int N){

        for (int a = 1; a <= N; a++){
            String result = "";

            if(a % 2 == 0){
                result += "Codility";
            }

            if(a % 3 == 0){
                result += "Test";
            }

            if(a % 5 == 0){
                result += "Coders";
            }

            System.out.println(result.isEmpty() ? a : result);
        }

        /*output for N = 60:
        1
        Codility
        Test
        Codility
        Coders
        CodilityTest
        7
        Codility
        Test
        CodilityCoders
        11
        CodilityTest
        13
        Codility
        TestCoders
        Codility
        17
        CodilityTest
        19
        CodilityCoders
        Test
        Codility
        23
        CodilityTest
        Coders
        Codility
        Test
        Codility
        29
        CodilityTestCoders
        31
        Codility
        Test
        Codility
        Coders
        CodilityTest
        37
        Codility
        Test
        CodilityCoders
        41
        CodilityTest
        43
        Codility
        TestCoders
        Codility
        47
        CodilityTest
        49
        CodilityCoders
        Test
        Codility
        53
        CodilityTest
        Coders
        Codility
        Test
        Codility
        59
        CodilityTestCoders
          */
    }

}


/*
 Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
    If a number is divisible by more than one of the numbers: 2, 3, or 5, it should be replaced by a concatenation
    of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2
    and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2, 3 and 5, should be replaced
    by CodilityTestCoders.

    For example, here is the output for N = 24:
    1
    Codility
    Test
    Codility
    Coders
    CodilityTest
    7
    Codility
    Test
    CodilityCoders
    11
    CodilityTest
    13
    Codility
    TestCoders
    Codility
    17
*/


