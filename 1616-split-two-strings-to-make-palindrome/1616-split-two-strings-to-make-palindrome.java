class Solution {
    public static boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }

    public static boolean check(String a, String b){
        int left=0;
        int right=a.length()-1;

        // Move inward as long as the characters match across strings
        while(left<right && a.charAt(left)==b.charAt(right)){
            left++;
            right--;
        }

        // If the pointers met or crossed, it's a perfect split palindrome
        if(left>=right) return true;

        // Otherwise, check if the remaining middle part of EITHER 'a' or 'b' is a palindrome
        return isPalindrome(a,left,right) || isPalindrome(b,left,right);
    }

    public static boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;

    }
}