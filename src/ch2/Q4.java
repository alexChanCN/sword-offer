package ch2;

public class Q4 {
    public static boolean Find(int target, int [][] array) {
        int i =0, j=array[0].length-1;
        while (j>=0&&i<=array.length-1){        //注意边界值
            if(array[i][j]>target){
                j--;
            }
            else if(array[i][j]<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,8,9},{4,7,10,13}};
        System.out.println(Find(7,nums));
    }
}
