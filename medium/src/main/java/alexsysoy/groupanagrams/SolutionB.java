package alexsysoy.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// fast; high memory
public class SolutionB implements Solution {
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = sortString(strs[i]);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(strs[i]);
        }
        List<List<String>> sol = new ArrayList<>();
        for (String s : map.keySet()) {
            sol.add(map.get(s));
        }
        return sol;
    }

    private String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
