package leetcode.SummerDay6;

public class GoodWordsQ1160 {
    // Optimal Approach
    public static int countCharacters(String[] words, String chars) {
        int ans = 0;
        int[] freq = new int[26];
        for (char ch : chars.toCharArray()) {
            freq[ch - 'a'] += 1;
        }
        for (String st : words) {
            int[] temp = freq.clone();
            boolean foundGood = true;
            for (char ch : st.toCharArray()) {
                if (temp[ch - 'a'] == 0) {
                    foundGood = false;
                    break;
                } else {
                    temp[ch - 'a'] -= 1;
                }
            }
            if (foundGood)
                ans += st.length();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countCharacters(new String[] { "cat", "bt", "hat", "tree" }, "atach"));
        System.out.println(countCharacters(new String[] { "hello", "world", "leetcode" }, "welldonehoneyr"));

    }
}
