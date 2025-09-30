package leetCodeProblems.basicLeetCode.problems;

/*   Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
            Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    For example, 2 is written as II in Roman numeral, just two ones added together.
    12 is written as XII, which is simply X + II.
    The number 27 is written as XXVII, which is XX + V + II.
   public void convertRomanToInteger(String roman){
*/

import java.util.HashMap;

public class RomanToIntege {

   public void convertRomanToInteger(String roman){
       HashMap<Character, Integer> romanValues = new HashMap<>();
       romanValues.put('I', 1);
       romanValues.put('V', 5);
       romanValues.put('X', 10);
       romanValues.put('L', 50);
       romanValues.put('C', 100);
       romanValues.put('D', 500);
       romanValues.put('M', 1000);
       int total = 0;

       for(int i=0; i<roman.length();i++){
           int currentValue = romanValues.get(roman.charAt(i));
           System.out.println("current Value : "+currentValue);
           if(i<roman.length()-1){
               int nextValue = romanValues.get(roman.charAt(i+1));
               System.out.println("Next Value "+nextValue);
               if(currentValue<nextValue){
                   total-=  currentValue;
               }else{
                   total+= currentValue;
               }
           }else{
               total+= currentValue;
           }
       }
      System.out.println("The converted value is :"+total);
   }



    public static void main(String[] args) {
        String romanChar = "MCMXCIV";
       RomanToIntege RI = new RomanToIntege();
        RI.convertRomanToInteger(romanChar);
    }
}
