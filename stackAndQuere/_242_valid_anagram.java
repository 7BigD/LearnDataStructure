package stackAndQuere;

import java.util.Arrays;

/**
 * @author BigD
 * @Create 2021-03-15 19:38
 */
public class _242_valid_anagram {

    /**
     *  方法1： sort 排序
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);

    }

    /**
     *  哈希表实现
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] table = new char[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
            table[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (table[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
