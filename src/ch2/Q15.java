package ch2;

public class Q15 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n!=0){       //n>0错误，没有考虑到n为负数的情况
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
