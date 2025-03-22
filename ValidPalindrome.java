public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String word = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").replaceAll("[.,:]", "");
        int left = 0;
        int right = word.length() - 1;
        while (left <= right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome palindrome = new ValidPalindrome();
        System.out.println(palindrome.isPalindrome("race a car"));
    }
}
