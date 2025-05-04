public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(14));
    }

    public static boolean isPerfectSquare(int num) {
        int sqrtNum = (int) Math.sqrt(num);
        if (sqrtNum * sqrtNum == num)
            return true;
        return false;
    }
}
