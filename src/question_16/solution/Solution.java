package question_16.solution;

class Solution {
    public double myPowOverTime(double x, int n) {
        double toReturn;
        int pow = n < 0 ? -n : n;
        if ((pow & 1) == 1) {
            toReturn = myPowOverTime(x, pow - 1) * x;
        } else {
            if (pow == 0)
                toReturn = 1;
            else
                toReturn = myPowOverTime(x, pow / 2) * myPowOverTime(x, pow / 2);
        }
        return n < 0 ? 1 / toReturn : toReturn;
    }

    public double myPow(double x, int n) {
        double res = 1.0;
        if (n == 0)
            return res;
        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b != 0) {
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myPow(0.00001, 2147483647));
    }
}