package com.example;

public class W02PrintingPatterns {
    private W02PrintingPatterns() {}

    public static void trianglePattern(int rows) {
        String format = "%-" + digits(rows * (rows + 1) / 2) + "d ";
        int start = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf(format, start++);
            }
            System.out.println();
        }
    }

    public static void pascalPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            int current = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", current);
                current = current * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        trianglePattern(5);
        pascalPattern(5);
    }

    public static int digits(int n) {
        return (int) Math.log10(n) + 1;
    }
}
