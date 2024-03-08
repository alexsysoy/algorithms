package alexsysoy.utils;

import alexsysoy.Sort;

public final class SortUtils {
    private SortUtils() {}

    public static void calculate(Sort sort, Integer[] massive) {
        sort.printArray(massive, null);
        long time = System.currentTimeMillis();
        sort.sort(massive);
        sort.printArray(massive, System.currentTimeMillis() - time);
    }
}
