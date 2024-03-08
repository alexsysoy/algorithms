package alexsysoy;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Sort {

    void sort(Integer[] massive);

    default void printArray(Integer[] massive, Long time) {
        if (time != null) {
            System.out.println("Sort has taken (ms): " + time);
        }
        System.out.println(Stream.of(massive).map(String::valueOf).collect(Collectors.joining(", ")));
    }

    default Integer[] generate(int numbers) {
        Integer[] array = new Integer[numbers];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(numbers);
        }
        return array;
    }

}
