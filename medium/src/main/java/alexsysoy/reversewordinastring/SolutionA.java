package alexsysoy.reversewordinastring;

import java.util.ArrayList;
import java.util.List;

public class SolutionA implements Solution {
    @Override
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (Character.isWhitespace(tmp) && !sb.isEmpty()) {
                list.add(sb.toString());
                sb = new StringBuilder();
            } else if (!Character.isWhitespace(tmp)) {
                sb.append(tmp);
            }
        }

        if (!sb.isEmpty()) {
            list.add(sb.toString());
            sb = new StringBuilder();
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i)).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
