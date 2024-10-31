package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L387 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];
        for(char c : arr) {
            count[(int) c]++;
        }
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if(count[(int) c] == 1) {
                return i;
            }
        }
        return -1;
    }
    
    public int firstUniqChar2(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        // Đếm số lần xuất hiện của mỗi ký tự
        for(char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // Tìm ký tự đầu tiên xuất hiện duy nhất
        for(int i = 0; i < s.length(); i++) {
            if(charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
