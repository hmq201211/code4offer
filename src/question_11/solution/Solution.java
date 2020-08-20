package question_11.solution;

class Solution {
    public int minArray(int[] numbers) {
        if (numbers.length == 1)
            return numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < max) {
                return numbers[i];
            } else {
                max = numbers[i];
            }
        }
        return numbers[0];
    }
}