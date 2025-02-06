package alexsysoy.countnumbers;

import java.util.Map;

/**
 * Необходимо подсчитать количество всех элементов списка/массива и вернуть ассоциативных массив,
 * где ключ – элемент списка, значение – количество этих элементов в списке.
 * Порядок не имеет значения. Пример: [1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
 *
 * Предполагаем, что:
 * 1) количество элементов ограничено Long
 * 2) элементами являются числа до Long
 * 3) вводимые данные не null
 *
 * В groove:
 * {@code def count(int[] array) {
 *     def result = [:]
 *     array.each { num ->
 *         result[num] = (result[num] ?: 0) + 1
 *     }
 *     return result
 * }
 * }
 */
public interface Solution {
    Map<Long, Long> count(long[] massive);
}
