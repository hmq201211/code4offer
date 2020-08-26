package question_58_2.solution;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < n + s.length(); i++) {
            stringBuilder.append(s.charAt(i % s.length()));
        }
        return stringBuilder.toString();
    }
}
