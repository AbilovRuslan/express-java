package practice_11;

public class DebagTask4 {  public static void main(String[] args) {
    System.out.println(isPalindrome(null));
}
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false; // или true, если хочешь считать null палиндромом
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
