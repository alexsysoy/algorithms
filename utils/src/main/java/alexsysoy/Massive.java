package alexsysoy;

public class Massive {

    /**
     * String -> long[]
     */
    public static long[] getLongMassive(String massive) {
        String[] split = massive.split(",");
        long[] result = new long[split.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Long.parseLong(split[i]);
        }
        return result;
    }

    /**
     * String -> int[]
     */
    public static int[] getIntMassive(String massive) {
        if (massive == null || massive.isEmpty()) {
            return new int[]{};
        }
        String[] split = massive.split(",");
        int[] result = new int[split.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }
        return result;
    }
}
