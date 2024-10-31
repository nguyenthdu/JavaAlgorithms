package leetcode;

//TODO: 1672. Richest Customer Wealth
public class L1672 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        //        int [][] brr = new int[][];
    }
    
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] account : accounts) {
            int sum = 0;
            for(int i : account) {
                sum += i;
            }
            if(sum > max)
                max = sum;
        }
        return max;
    }
}
