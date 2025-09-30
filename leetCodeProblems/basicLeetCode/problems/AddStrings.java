package leetCodeProblems.basicLeetCode.problems;
/*
Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"

 numbers  trying to add are too large to be stored accurately in a
 standard Java long (64-bit signed integer).

The maximum value a long can hold is 2^63
 −1, which is approximately 9.22×10^18
 .

 input strings are:

num1: 3,876,620,623,801,494,171 (Less than Max Long)

num2: 6,529,364,523,802,684,779 (Less than Max Long)

Expected Sum: 10,405,985,147,604,178,950 (≈1.04×10^19 )

The sum exceeds the maximum positive value of a long.
When you perform the addition numm1 + numm2, it results in a long overflow,
causing the sum to wrap around to a large negative number, which is what
you see in the "actual" output.
 */


import java.math.BigInteger;

public class AddStrings {

    public String addStrings(String num1, String num2) {
        String addSum = "";

        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);
        BigInteger result = bigNum1 .add(bigNum2);

        addSum = result.toString();
        System.out.println(" The Output of the value is " + bigNum1 + " & " + bigNum2 + " = " + addSum);
        return addSum;
    }

    public static void main(String[] args) {
        String num1 ="3876620623801494171";
        String num2 ="6529364523802684779";
        AddStrings as = new AddStrings();
        as.addStrings(num1,num2);
    }
}
