package ch2;

public class Q14 {
    static public int cut(int n) {
        if (n < 2) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;
        int num = n / 3, remain = n % 3, res;
        if (remain == 1)
            num--;
        remain = n - num * 3;
        res = (int) (Math.pow(3, num) * Math.pow(2, remain));
        return res;
    }

    public static void main(String[] args) {
        System.out.println(cut(6));
    }
}
