package stackAndQuere;

import ArrayAndLinkNode.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author BigD
 * @Create 2021-03-15 20:38
 */
public class _49_groupAnagrams {
    /*
    think:
    1. hashmap 便利整个 String[] strs if 存在
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = new ArrayList<>();
        List<List<String>> listList = new ArrayList<>();
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = i + 1; j < strs.length; j++) {
            }
        }

        return null;
    }

    public boolean isAna(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }
}
