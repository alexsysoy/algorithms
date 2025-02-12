package alexsysoy.groupanagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// very low; very low memory
public class SolutionA implements Solution {
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean isContain = false;
        for (String str : strs) {
            for (List<String> list : result) {
                if (!list.isEmpty() && areAnagrams(str, list.get(0))) {
                    list.add(str);
                    isContain = true;
                    break;
                }
            }
            if (!isContain) {
                result.add(new ArrayList<>(Collections.singletonList(str)));
            }
            isContain = false;
        }
        return result;
    }

    private boolean areAnagrams(String str1, String str2) {
        if (str2.length() != str1.length()) {
            return false;
        }

        int[] count = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i)]--;
        }

        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}
