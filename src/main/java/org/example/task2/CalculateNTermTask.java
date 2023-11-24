package org.example.task2;

public class CalculateNTermTask {
    public static int calculate(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }

        int prevTerm = 3;
        int currentTerm = 0;

        for (int i = 4; i <= n; i++) {
            if (i % 2 == 0) {
                currentTerm = 2 * prevTerm;
            } else {
                currentTerm = (int) (1.5 * prevTerm);
            }
            prevTerm = currentTerm;
        }

        return currentTerm;
    }

}
