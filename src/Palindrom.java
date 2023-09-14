public class Palindrom {
        public static void main(String[] args) {

            System.out.println(isPalindrome("Hello", reverseString("Hello")));
            System.out.println(isPalindrome("hello", reverseString("hello")));
            System.out.println(isPalindrome("hello", "world"));
        }
        public static String reverseString(String str){
            StringBuilder ans = new StringBuilder();
            for (int i=0; i<str.length();i++){
                char ch = str.charAt(i);
                ans.insert(0, ch);
            }
            return ans.toString();
        }

        public static boolean isPalindrome(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            for (int i = 0; i<str1.length(); i++){
                if (charArray1[i] != charArray2[charArray2.length - i-1]){
                    return false;
                }
            }
            return true;
        }
}
