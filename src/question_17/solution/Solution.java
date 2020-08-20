package question_17.solution;

class Solution {
    public int[] printNumbers(int n) {
        final int max = (int) Math.pow(10, n) - 1;
        int[] toReturn = new int[max];
        for (int i = 1; i <= max; i++) {
            toReturn[i - 1] = i;
        }
        return toReturn;
    }
}