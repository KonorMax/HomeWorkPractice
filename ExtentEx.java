package com.konor.HomeWorkPractice;

public class ExtentEx {
    public static double myExtent(double x, int n) {
        double ans = 1.0;
        long num = n;
        if (n < 0) {
            num = -1 * num;
        }
        while (num > 0) {
            if (num % 2 == 0) {
                x = x * x;
                num = num / 2;
            } else {
                ans = ans * x;
                num = num - 1;
            }
        }
        if (n < 0) {
            return 1.0 / ans;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(myExtent( 5.0, 7));
    }
}
