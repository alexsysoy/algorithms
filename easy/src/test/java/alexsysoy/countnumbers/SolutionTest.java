package alexsysoy.countnumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static alexsysoy.Massive.getMassive;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @CsvSource(value = {
            "56;56:1",
            "1,3,4,5,1,5,4;1:2,3:1,4:2,5:2",
            "44,44,44,44,44;44:5",
            "1,2,3,-1,-7,0,-7;1:1,2:1,3:1,-1:1,-7:2,0:1"
    }, delimiter = ';')
    void testSolution(String s, String result) {
        long[] massive = getMassive(s);
        Map<Long, Long> expected = getMap(result);

        Solution solution = new SolutionImpl();
        Map<Long, Long> actual = solution.count(massive);

        assertEquals(expected, actual);
    }

    private Map<Long, Long> getMap(String result) {
        HashMap<Long, Long> map = new HashMap<>();
        String[] split = result.split(",");
        for (String s : split) {
            List<Long> list = Arrays.stream(s.split(":")).map(Long::parseLong).toList();
            map.put(list.get(0), list.get(1));
        }
        return map;
    }

}