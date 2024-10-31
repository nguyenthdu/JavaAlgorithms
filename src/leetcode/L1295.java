package leetcode;

//1295. Find Numbers with Even Number of Digits
public class L1295 {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println("number of even: " + findNumbers(arr));
    }
    
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums) {
            if(checkEven(n) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    public static int checkEven(int num) {
        int count = 0;
        while(num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
