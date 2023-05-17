package org.example.BinarySearch;

public class q1 {
    public static void main(String[] args) {
        int n = 2;
        int m = 16;

        nRoot(n, m);

    }

    private static void nRoot(int n, int m) {
        double l = 1;
        double h = m;
        double eps = 1e-7;

        while (h - l > eps) {
            double mid = l + (h - l) / 2.0;
            if (multiply(mid, n) < m) l = mid;
            else h = mid;
        }
        System.out.println("Nth root - " +l);
    }

    private static double multiply(double num, int n) {
        double ans = 1.0;

        for (int i = 1; i <= n; i++)
            ans *= num;

        return ans;
    }
}
