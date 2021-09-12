package offer;

import java.util.HashMap;
import java.util.Map;

public class _48_lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int resMax = 0;
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int j = 0, i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                j = Math.max(j, hashMap.get(s.charAt(i)) + 1);
            }
            hashMap.put(s.charAt(i), i);
            resMax = Math.max(resMax, i - j + 1);
        }
        return resMax;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new _48_lengthOfLongestSubstring().lengthOfLongestSubstring(s));
    }

}
