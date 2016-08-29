// run from the command line with:
// javac PalindromeTester.java && java PalindromeTester

public class PalindromeTester {

  public boolean isPalindrome(String input) {
     input = input.replaceAll("\\s","");
     int n = input.length();
     for (int i = 0; i < (n/2); i ++){
       if (input.charAt(i) != input.charAt(n-i-1)) {
         return false;
       }
     }
     return true;
   }

  public static void main(String[] args) {
    printTestPalindrome("race car"); //true
    printTestPalindrome("wat"); //false
    printTestPalindrome("stack cats"); //true
    printTestPalindrome("who"); //false
    printTestPalindrome("step on no pets"); //true
    printTestPalindrome("when"); //false
    printTestPalindrome("taco cat"); //true
  }

  public static void printTestPalindrome(String input) {
    PalindromeTester tester = new PalindromeTester();
    System.out.println(input + ": " + tester.isPalindrome(input)); //true
  }

}
