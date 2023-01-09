package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        var memo = new int[Math.max(n + 1, 3)];
        Arrays.fill(memo, -1);
        memo[1] = 0;
        memo[2] = 1;

        return getNthFib(n, memo);
    }

    public int getNthFib(int n, int[] fib) {
        if (fib[n] == -1) {
            fib[n] = getNthFib(n - 1, fib) + getNthFib(n - 2, fib);
        }
        return fib[n];
    }

    public static void main(String[] args) {
        E01 e = new E01();
        System.out.println(e.getNthFib(6));
    }
}
