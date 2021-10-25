public class Palindrome {
    public static boolean isPalindrome(int a) {
        boolean palindromeYes = true;
        boolean palindromeNo = false;
        int b = a % 10;
        int c = (a % 100)/10;
        int d = a / 10000;
        int e = (a % 10000)/1000;
        if (a <= 99999 && a>9999) {
            if (b == d) {
                if (c == e) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }




    }}

