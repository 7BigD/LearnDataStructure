package _05hashTableSet;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _242_isAnagram {

    /*
    1. 暴力 sort
    2. hash, map --> 统计每个字符的次数
     */
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
//        System.out.println("this is ss: " + Arrays.toString(ss));
        char[] ts = t.toCharArray();
        Arrays.sort(ts);
//        System.out.println("this is ss: " + Arrays.toString(ts));
        if (Arrays.equals(ss, ts)) {
            return true;
        }
        return false;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        for (int i = 0; i < t.length(); i++) {
            if (hashMap.containsKey(ts[i])) {
                hashMap.put(ts[i], hashMap.get(ts[i]) + 1);
            } else {
                hashMap.put(ts[i], 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(ss[i])) {
                hashMap.put(ss[i], hashMap.get(ss[i]) - 1);
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            table[index]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            table[index]--;
        }
        for (int i = 0; i < 26; i++) {
            if (table[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _242_isAnagram ia = new _242_isAnagram();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(ia.isAnagram(s, t));
    }

}