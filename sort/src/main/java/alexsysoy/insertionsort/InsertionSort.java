package alexsysoy.insertionsort;

import alexsysoy.Sort;

public class InsertionSort implements Sort {
    @Override
    public void sort(Integer[] massive) {
        for (int i = 0; i < massive.length; i++) {
            int j = i;
            int key = massive[i];
            while (j > 0 && key < massive[j - 1]) {
                massive[j] = massive[j - 1];
                j--;
            }
            massive[j] = key;
        }
    }
}
