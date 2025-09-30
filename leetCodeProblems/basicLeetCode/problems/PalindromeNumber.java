package leetCodeProblems.basicLeetCode.problems;

/*
9. Palindrome Number
Given an integer , return true  if x  is a palindrome , and false  otherwise.
Input:  x = 121 , Output:  true, Explanation:  121 reads as 121 from left to right and from right to left.
 */


public class PalindromeNumber {


    public boolean palindromeNumberTest(int number){
        int num = number;
        String numStr = String.valueOf(num);
        System.out.println(" The value of the number is " + numStr);
        String rev = "";
        for(int i =numStr.length()-1; i>=0;i--){
            rev = rev+numStr.charAt(i);
        }
        System.out.println(" The reverse value of the number is" + rev);
        if( Integer.valueOf(rev).equals(number)){
            System.out.println(" The original number is " +number +" and Reverse num "+ rev);
            return true;
        } else{
            System.out.println(" The original number is " +number +" and Reverse num "+ rev);
            return false;
        }
    }

    public static void main(String[] args) {

        int num = 121;
        PalindromeNumber pn = new PalindromeNumber();
        if(pn.palindromeNumberTest(num)==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
