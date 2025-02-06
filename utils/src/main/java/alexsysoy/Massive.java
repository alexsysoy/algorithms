package alexsysoy;

public class Massive {

    /**
     * String -> int[]
     */
    public static long[] getMassive(String massive) {
        String[] split = massive.split(",");
        long[] result = new long[split.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Long.parseLong(split[i]);
        }
        return result;
    }
}
