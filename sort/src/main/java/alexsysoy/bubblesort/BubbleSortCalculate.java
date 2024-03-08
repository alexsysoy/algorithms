package alexsysoy.bubblesort;

import alexsysoy.Sort;

/**
 * Wost-case performance O(n2)
 * Best-case performance O(n)
 * Average performance O(n2)
 */
public class BubbleSortCalculate {
    public static void main(String[] args) {
        Sort bubbleSortA = new BubbleSortA();
        Integer[] massive = bubbleSortA.generate(10);
        Integer[] cloneA = massive.clone();
        calculate(bubbleSortA, cloneA);

        System.out.println("\n");

        BubbleSortB bubbleSortB = new BubbleSortB();
        Integer[] cloneB = massive.clone();
        calculate(bubbleSortB, cloneB);

    }

    private static void calculate(Sort sort, Integer[] massive) {
        sort.printArray(massive, null);
        long time = System.currentTimeMillis();
        sort.sort(massive);
        sort.printArray(massive, System.currentTimeMillis() - time);
    }
}
