package ch2;

public class Q10_4 {
    /**
     *  f(n) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2) + f(n-1) = f(n-1) + f(n-1)
     *
     *      1       ,(n=0 )
     f(n) = 1       ,(n=1 )
            2*f(n-1),(n>=2)
     */
    public int RectCover(int target) {
        int first = 1, second = 2,res = 0;
        if(target<3) return target;
        for(int i = 3;i<=target;i++){
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}
