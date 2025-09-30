package leetCodeProblems.basicLeetCode.problems;

import java.util.Arrays;

public class TwoSum {

/*
Example 1:
Input:  nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation:  Because nums[0] + nums[1] == 9, we return [0, 1].
 */

    public static void main(String[] args) {

        int[] inputNum = {0, 6, 11, 15, 3};
        int target = 9;
        TwoSum tw = new TwoSum();
        tw.twoSum(inputNum, target);
    }

    public void twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        System.out.println(" The values of the arrays are " + Arrays.toString(nums));
        if (nums.length <= 0) {
            System.out.println(" The Array is empty");
        } else {
            for (i = 0; i < nums.length; i++) {
                for (j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        System.out.println(" The position of the element one : " + i + " and Value: " + nums[i] + " The Position of element two: " + j + " and the Value: " + nums[j]);
                        int[] array = new int[2];
                        array[0] = i;
                        array[1] = j;
                        System.out.println(Arrays.toString(array));

                        break;
                    }
                }
            }
        }

    }


}
