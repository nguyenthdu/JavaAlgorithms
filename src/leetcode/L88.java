package leetcode;

public class L88 {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 0, 0, 0};
        int[] arr2 = {1, 2, 3};
        merge2(arr1, 3, arr2, 3);
        for(int n : arr1) {
            System.out.println(n);
        }
    }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int n2 : nums2) {
            insertElement(nums1, n2, m);
            m++;
        }
    }
    
    private static void insertElement(int[] nums1, int n2, int m) {
        boolean isFound = false;
        for(int i = 0; i < m; i++) {
            if(nums1[i] > n2) {
                isFound = true;
                for(int j = m - 1; j >= i; j--) {
                    nums1[j + 1] = nums1[j];
                }
                nums1[i] = n2;
                break;
            }
        }
        if(!isFound) {
            nums1[m] = n2;
        }
    }
    
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;
        while(k >= 0) {
            if(j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if(i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
