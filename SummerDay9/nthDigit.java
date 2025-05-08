package leetcode.SummerDay9;

public class nthDigit {
    public static int findNthDigit(int n) {
        long start = 1;
        long end = 9;
        long digits = 1;
        long longNum = n;

        while (longNum > digits * end) {
            longNum -= digits * end;
            end *= 10;
            start *= 10;
            digits += 1;
        }
        start += (longNum - 1) / digits;
        String ansString = String.valueOf(start);
        int ans = ansString.charAt((int) ((longNum - 1) % digits)) - '0';
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(11));
    }
}
