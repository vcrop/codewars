package rail;

public class RailFenceCipher {

    public static String encode(String s, int n) {
        int step = (n - 1) << 1;

        StringBuilder ret = new StringBuilder();

        for (int rail = 0; rail < n; rail++) {
            int[] steps = {step - (2 * rail), 2 * rail};
            int delta = -1;
            for (int i = rail, j = 0; i < s.length(); i += delta) {
                if (delta != 0) ret.append(s.charAt(i));
                delta = steps[j++ % 2];
            }
        }

        return ret.toString();
    }

    public static String decode(String s, int n) {
        int step = (n - 1) << 1;

        char[] ret = new char[s.length()];

        int pos = 0;

        for (int rail = 0; rail < n; rail++) {
            int[] steps = {step - (2 * rail), 2 * rail};
            int delta = -1;
            for (int i = rail, j = 0; i < s.length(); i += delta) {
                if (delta != 0) ret[i] = s.charAt(pos++);
                delta = steps[j++ % 2];
            }
        }

        return new String(ret);
    }

}
