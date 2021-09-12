package SlideWindows;

import java.util.HashMap;
import java.util.Map;

/**
 * 最小覆盖子串
 * @author BigD
 * @Time
 */
public class _76_minWindow {

    public String minWindow(String s, String t) {
        // 一个need map 来存放，我们需要达到的目标字符子串。
        // 一个window map 来代表，此刻的 要滑动的窗口。

        /**
         * 感悟：有一个很重要的点是：如何维护，窗口。  用 map / set 个人觉得都可以。题目不一样。
         */
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0;
        int valid = 0; // 判断是否满足 子串
        int start = 0, len = s.length() + 1;
        while (right < s.length()) {
            // 拿到当前 字符
            char c = s.charAt(right);
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (valid == t.length()) {
                if (right - left + 1 < len) {
                    len = right - left  + 1;
                    start = left;
                }
                char charLeft = s.charAt(left);
                left++;
                if (need.containsKey(charLeft)) {
                    if (need.get(charLeft).equals(window.get(charLeft))) {
                        valid--;
                    }
                    window.put(charLeft, window.get(charLeft) - 1);
                }
            }
            right++;
        }
        return len == s.length() - 1 ? "" : s.substring(start, start + len);
    }
}
