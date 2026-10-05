public class StringPalindrome {
    public static boolean isPalindrome(String str) {
        // Handle case insensitivity and clean up if needed
        str = str.toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found, not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }

    public static void main(String[] args) {
        String test = "Radar";
        System.out.println(test + " is palindrome? " + isPalindrome(test));
    }
}
