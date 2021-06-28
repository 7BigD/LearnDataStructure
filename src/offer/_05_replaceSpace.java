package offer;

public class _05_replaceSpace {

    /*
    1. 替换空格   ' ' -> %20
    2. 新建字符串。
     */
    public String replaceSpace(String s) {

        StringBuffer str = new StringBuffer();
        int len = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (chars[i] != ' ') {
                str.append(chars[i]);
            } else {
                str.append("%20");
            }
        }
        return str.toString();
    }


}
