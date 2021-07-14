package _05hashTableSet;

import java.util.*;

public class _49_groupAnagrams {

    /*
    建立一个 hashmap   key存放，每一类的 Anagram 的标识。  value 存放对应的list。
    相关API：
        1. Arrays.sort(char[] chars)  // 底层实现，块排。 O(NlogN)
        2. new String(数组)
        3. map.getOrDefault(key, new ArrayList<String>());
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            String.valueOf(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(strs[i]);
            map.put(key, list);
        }
        List<List<String>> res = new ArrayList<List<String>>(map.values());
        return res;
    }

}
