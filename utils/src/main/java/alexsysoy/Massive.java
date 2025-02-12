package alexsysoy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * String -> String[]
     */
    public static String[] getStringMassive(String massive) {
        if (massive == null || massive.isEmpty()) {
            return new String[]{};
        }
        String[] split = massive.split(",");
        String[] result = new String[split.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = split[i];
        }
        return result;
    }

    /**
     * String -> List<List<String>>
     */
    public static List<List<String>> getStringDoubleMassive(String massive) {
        List<List<String>> result = new ArrayList<>();
        if (massive == null || massive.isEmpty()) {
            return List.of(List.of());
        }
        String[] split = massive.split(":");
        for (String s : split) {
            result.add(new ArrayList<>(Arrays.asList(s.split(","))));
        }
        return result;
    }
}
