package ch2;

public class Q3 {
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        duplication[0] = -1;
        if(numbers==null||numbers.length==0){
            return false;
        }
        int i = 0;
        while (i != numbers[i]) {
            int temp = numbers[numbers[i]];
            if(numbers[i]!=temp){
                numbers[numbers[i]] = numbers[i];
                numbers[i] = temp;
            }
            else {
                duplication[0] = temp;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 1, 4};
        int[] duplication = new int[1];
        System.out.println(duplicate(nums, 5, duplication));
        System.out.println(duplication[0]);
    }
}
