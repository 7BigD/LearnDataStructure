package _20_String;

public class _8_atoi {

    public int myAtoi(String s) {
        int index = 0, sign = 1, total = 0;

        // 1. Empty String
        if (s == null || s.length() == 0) return 0;

        if (s.trim().length() == 0) {
            return 0;
        }

        // 2. remove space
        while ( index < s.length()  && s.charAt(index) == ' ')
            index++;

        // 3. Handle sign
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        // 4. Convert number and avoid overflow
        while (index < s.length()) {
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }

            if (Integer.MAX_VALUE / 10 < total ||
                    Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = total * 10 + digit;
            index++;
        }
        return total * sign;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(new _8_atoi().myAtoi(s));

        String s1 = "  s fadf adfa ";
        System.out.println(s1.trim());



    }

}
