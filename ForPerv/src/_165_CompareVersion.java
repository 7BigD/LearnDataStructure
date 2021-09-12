
public class _165_CompareVersion {

    public static int compareVersion(String s1, String s2) {
        String[] ss1 = s1.split("\\.");
        String[] ss2 = s2.split("\\.");

        int length = Math.max(ss1.length, ss2.length);
        for (int i = 0; i < length; i++) {
            int i1 = i < ss1.length ? Integer.parseInt(ss1[i]) : 0;
            int i2 = i < ss2.length ? Integer.parseInt(ss2[i]) : 0;
            if (i1 > i2) {
                return 1;
            }else if (i1 < i2) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s1 = "1.0";
        String s2 = "1.00.0";
        System.out.println(_165_CompareVersion.compareVersion(s1, s2));
    }

}
