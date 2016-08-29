// run from the command line with:
// javac PalindromeTester.java && java PalindromeTester

// BIG O notation of linear O(n)

public class PalindromeTester {

  public boolean isPalindrome(String input) {
    //remove all spaces in the input string
     input = input.replaceAll("\\s","");
     //assign int n to the length of the input
     int n = input.length();
     //loop through n /2 so we will be looking at only one half of the input
     for (int i = 0; i < (n/2); i ++){
       //if the input i charAt is the same as the n postion to i then return false
       if (input.charAt(i) != input.charAt(n-i-1)) {
         return false;
       }
     }
     //if not return true bcause it is a Palindrome
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
