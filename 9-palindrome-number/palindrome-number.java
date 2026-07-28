class Solution {
    public boolean isPalindrome(int x) {
        String s = x + "";
        return pallindrome(s);
    }

    static boolean pallindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}