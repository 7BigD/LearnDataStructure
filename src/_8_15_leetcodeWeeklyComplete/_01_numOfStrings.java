package _8_15_leetcodeWeeklyComplete;

import java.util.HashSet;
import java.util.Set;

public class _01_numOfStrings {

    public static int numOfStrings(String[] patterns, String word) {
        String sub = "";
        int result = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                sub = sub + word.charAt(j);
            }
            sub = "";
        }
        for (int k = 0; k < patterns.length; k++) {
            if (set.contains(patterns[k])) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numOfStrings(new String[]{"a", "b", "c"}, "aaaabbbbb"));
    }

}
