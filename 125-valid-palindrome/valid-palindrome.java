class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char letter = Character.toLowerCase(s.charAt(i));
            if ((letter >= 'a' && letter <= 'z') || (letter >= '0' && letter <= '9')) {
                str.append(letter);
            }
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
