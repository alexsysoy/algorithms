package alexsysoy.prefixfunction;

public class FirstRealisation implements PrefixFunction {
    @Override
    public int[] get(String string) {
        int n = string.length();
        int[] p = new int[n];
        int[] k;
        for (int i = 1; i < n; i++) {
            for (int len = 1; len <= i; len++) {
                if (string.substring(0, len).equals(string.substring(i - len + 1, i + 1))) {
                    p[i] = len;
                }
            }
        }

        return p;
    }
}
