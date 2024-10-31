package leetcode;

public class L1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"ab", "t"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for(String s : word1) {
            w1.append(s);
        }
        for(String s : word2) {
            w2.append(s);
        }
        return w1.toString().equals(w2.toString());
    }
}
