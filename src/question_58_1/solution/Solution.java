package question_58_1.solution;

public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return s;
        String string = s.trim();
        StringBuilder sb = new StringBuilder();
        int i = string.length() - 1;
        int j = string.length() - 1;
        while (i >= 0) {
            while (i >= 0 && string.charAt(i) != ' ') i--;
            sb.append(string, i + 1, j + 1);
            sb.append(" ");
            while (i >= 0 && string.charAt(i) == ' ') i--;
            j = i;
        }
        return sb.toString().trim();
    }
}