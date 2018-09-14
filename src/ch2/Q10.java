package ch2;

public class Q10 {
/*    public int Fibonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }*/
    public int Fibonacci(int n) {
        int first = 0, second = 1,res = 0;
        if(n<2) return n;
        for(int i = 2;i<=n;i++){        //i<=n,不然i=2时，没有进入循环
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}
