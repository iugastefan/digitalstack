package com.example;

public class W04Strings {
    private W04Strings() {}

    public static char[] reverse(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[n - i - 1];
            s[n - i - 1] = s[i];
            s[i] = temp;
        }
        return s;
    }

    private static boolean checkReverse(String s, String t) {
        return new String(reverse(s.toCharArray())).equals(t);
    }

    public static void main(String[] args) {
        assert checkReverse("hello", "olleh");
        assert checkReverse("Hannah", "hannaH");
        assert !checkReverse("abc", "abc");
        System.out.println("All tests passed");
    }
}
