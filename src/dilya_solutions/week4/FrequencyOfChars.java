package dilya_solutions.week4;

public class FrequencyOfChars {
    public static String frequencyOfChars(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char c = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }
            if (result.contains("" + c)) {
                continue;
            }
            result += c + "" + count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABCCCCC"));
    }
}
