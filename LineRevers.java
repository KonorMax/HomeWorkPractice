package com.konor.HomeWorkPractice;

public class LineRevers {
    public static void lineRevers(char[] s) {
        int len = s.length;
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left ++;
            right --;

        }
    }

    public static void main(String[] args) {
        char[] arr = {'j','a','v','a','t','o','p'};
        System.out.println(arr);
    }
}
