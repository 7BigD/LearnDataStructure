import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soluction {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字：");
        int option = input.nextInt();//read numerical value from input;
        System.out.println(option);
        System.out.println("请输入字符串1：");
        String string1 = input.nextLine();//read 1st string (this is skipped)
        System.out.println("请输入字符串2：");
        System.out.println(string1);
        String string2 = input.nextLine();//read 2nd string (this appears right after reading numerical value)
        System.out.println(string2);


//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        List<String> list = new ArrayList<>();
//        while (sc.hasNext()) {
//            String nowString = sc.next();
//            if (isTrue(nowString, s)) {
//                list.add(nowString);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

    }

    private static boolean isTrue(String ss, String s) {
        String[] ss1 = ss.split("\\.");
        String[] ss2 = s.split("\\.");
        if (ss1.length != ss2.length) {
            return false;
        }
        for (int i = 0; i < ss1.length; i++) {
            if (!ss1[i].equals(ss2[i]) || !ss2[i].equals("*")) {
                return false;
            }
        }
        return true;
    }
}
