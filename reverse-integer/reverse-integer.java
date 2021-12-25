class Solution {
    public int reverse(int x) {
        String y = String.valueOf(x);
        String reverse = "";
        if (y.charAt(0)=='-') {
            reverse = reverse + '-';
            for (int i = y.length(); i>1;i--) {
                reverse = reverse + y.charAt(i-1);
        }
        } else {
            for (int i = y.length(); i>0;i--) {
            reverse = reverse + y.charAt(i-1);
        }
        }
        try {
            int reversed = Integer.parseInt(reverse);
            if (reversed >= -Math.pow(2,31) && reversed <= Math.pow(2,31)-1) {
            return reversed;
            }
        } catch(Exception e) {
            return 0;
        }
        return 0;
    

    }
}