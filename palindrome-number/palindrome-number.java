class Solution {
    public boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        int length = y.length();
        int half = length/2;
        for (int i = 0; i<half;i++) {
            if (y.charAt(i)!=y.charAt(length-i-1)) {
                return false;
            }
        }
        return true;
    }
}