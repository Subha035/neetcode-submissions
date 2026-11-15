class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char left = Character.toLowerCase(arr[start]);
            char right = Character.toLowerCase(arr[end]);

            if (!((left >= 'a' && left <= 'z') || (left >= '0' && left <= '9'))) {
                start++;
            } else if (!((right >= 'a' && right <= 'z') || (right >= '0' && right <= '9'))) {
                end--;
            } else if (left == right) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
