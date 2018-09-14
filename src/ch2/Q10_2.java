package ch2;

public class Q10_2 {
    public int JumpFloor(int target) {
        int one = 1,two = 2,res = 0;
        if(target < 3) return target;
        for(int i = 3;i<=target;i++){
            res = one + two;
            one = two;
            two = res;
        }
        return res;
    }
}
