package leetcode;

public class L27 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        System.out.println(removeElement(arr, 3));
    }
    
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for(int i = 0; i < n; ) {
            if(nums[i] == val) {
                for(int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
    
    public static int useTwoPointer(int[] a, int x) {
        int n = a.length;
        int k = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] != x) {
                a[k] = a[i];
                k++;
            }
        }
        return k;
    }
}

