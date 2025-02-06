package alexsysoy.countnumbers;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SolutionImpl implements Solution {
    @Override
    public Map<Long, Long> count(long[] massive) {
//        HashMap<Integer, Integer> result = new HashMap<>();
//        for (int i = 0; i < massive.length; i++) {
//            if (result.containsKey(massive[i])) {
//                result.merge(massive[i], 1, Integer::sum);
//            } else {
//                result.put(massive[i], 1);
//            }
//        }
//        return result;
        return Arrays.stream(massive)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
