package NewOffer;

import java.util.ArrayList;
import java.util.List;

public class _15 {


    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) return list;

        int[] map = new int[26];
        int i = 0;
        for (; i < p.length(); i++) {
            map[p.charAt(i) - 'a']++;
            map[s.charAt(i) - 'a']--;
        }
        if (allZeros(map)) list.add(0);

        for (; i < s.length(); i++) {
            map[s.charAt(i) - 'a']--;
            map[s.charAt(i - p.length()) - 'a']++;
            if (allZeros(map))
                list.add(i - p.length() + 1);
        }
        return list;
    }

    public boolean allZeros(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "baa";
        String t = "aa";
        System.out.println(new _15().findAnagrams(s, t).toString());
    }

}
