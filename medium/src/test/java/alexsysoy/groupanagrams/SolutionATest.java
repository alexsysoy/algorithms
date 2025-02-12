package alexsysoy.groupanagrams;

import alexsysoy.Massive;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static alexsysoy.Massive.getStringDoubleMassive;

/**
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
class SolutionATest {

    @ParameterizedTest
    @CsvSource(value = {
            "eat,tea,tan,ate,nat,bat;bat:nat,tan:ate,eat,tea"
    }, delimiter = ';')
    void solutionATest(String rawList, String rawExpected) {
        List<List<String>> expected = getStringDoubleMassive(rawExpected);
        Solution solution = new SolutionA();
        String[] data = Massive.getStringMassive(rawList);

        System.out.println(expected);
        List<List<String>> lists = solution.groupAnagrams(data);

        System.out.println(lists);
    }
}