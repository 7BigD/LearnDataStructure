
public class BSearch {

    public final static double d = 1.412;
    public final static double e = 0.001;

    public static void main(String[] args) {
        double left = 1.0;
        double right = 2.0;
        while (left < right) {
            double mid = (left + right) / 2.0;
            if (Math.abs(mid - d) < e) {
                System.out.println("222");
                System.out.println("mid" + mid);
                break;
            }
            if (mid > d) {
                right = mid;
            } else {
                left = mid;
            }
        }

    }
}
