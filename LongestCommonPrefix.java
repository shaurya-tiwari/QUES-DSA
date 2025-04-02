public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        // Iterate through the array of strings
        for (int i = 0; i < strs.length; i++) {
            // Check if the current string does not start with the current prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = { "flower", "flow", "flight" };
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(result);
    }

}
