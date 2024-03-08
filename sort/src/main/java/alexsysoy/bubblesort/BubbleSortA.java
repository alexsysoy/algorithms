package alexsysoy.bubblesort;

import alexsysoy.Sort;

public class BubbleSortA implements Sort {
    @Override
    public void sort(Integer[] massive) {

        Integer temp;
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = i + 1; j < massive.length; j++) {
                if (massive[i] > massive[j]) {
                    temp = massive[i];
                    massive[i] = massive[j];
                    massive[j] = temp;
                }
            }
        }
    }
}
