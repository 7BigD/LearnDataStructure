public class Hanoi {
    public static void han(int n, char src, char mid, char dest) {
        if (n == 1) {
            System.out.println(src + "->" + dest);
            return;
        }
        han(n-1, src, dest, mid);
        System.out.println(src + "->" + dest);
        han(n-1, mid, src, dest);
        return ;
    }

    public static void main(String[] args) {
        han(10, 'A', 'B', 'C');
        String s = "";
        s.split("\\.");
    }

}