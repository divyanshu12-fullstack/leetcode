package leetcode.SummerDay6;

import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();

        while (n != 1 && !hs.contains(n)) {
            hs.add(n);
            int value = 0;
            while (n > 0) {
                int digit = n % 10;
                value += digit * digit;
                n /= 10;
            }
            n = value;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(46));
    }
}
