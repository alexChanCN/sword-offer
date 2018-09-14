package ch2;

public class Q11 {
    public int minNumberInRotateArray(int[] array) {
        int l = 0, r = array.length - 1;
        while (l < r) {
            int mid = l + (r - l)/2;
            if (array[mid] > array[r]) {
                l = mid + 1;
            }else if(array[mid] == array[r]){
                r--;
            }else {
                r=mid;      //这里不能写r=mid-1;
            }
        }
        return array[l];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        Q11 q11 = new Q11();
        q11.minNumberInRotateArray(nums);
    }

}
