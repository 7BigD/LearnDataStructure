import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(String s) {
//        高层次主干
//        1. filter out number and char ;
//        2. reverse and compare;

        String filterS = _filterNotNumberAndChar(s);

        String reversedS = _reversed(filterS);

        return reversedS.equalsIgnoreCase(filterS);
    }

    private static String _reversed(String filterS) {

        return  new StringBuilder(filterS).reverse().toString();
    }
    private static String _filterNotNumberAndChar(String s) {
        return  s.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println(_filterNotNumberAndChar(str));
        System.out.println(isPalindrome(str));
    }
}