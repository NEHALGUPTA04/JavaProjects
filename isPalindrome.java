public class isPalindrome {

    int palindrome() {
        String s = "abbda";
        int n = s.length();
        char[] c = new char[n];

        for (int i = 0; i < n; i++) {
            c[i] = s.charAt(i);

        }
        for (int i = 0; i < n / 2; i++) {
            if (c[i] != c[n - 1 - i]) {
                System.out.println(" not palindrome");
                return 0;
            }

        }
        System.out.println("palindrome");
        return 1;
    }

    public static void main(String args []){
        isPalindrome pali = new isPalindrome();
        pali.palindrome();
    }
}

