package DAY1.TWO_SUM;

import java.util.HashMap;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.



    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]


    Constraints:

    2 <= nums.length <= 10^4
    -10^9 <= nums[i] <= 10^9
    -10^9 <= target <= 10^9
    Only one valid answer exists.


    Follow-up: Can you come up with an algorithm that is less than O(n^2) time complexity?
*/
public class Main {
    public static void main(String[] args) {
        int[] A = {2,3,4};
        int B = 6;
        int[] ans = twoSum(A,B);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] twoSum(final int[] A,int B)
    {
//        int[] result = new int[2];
        int length = A.length;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i< length; i++)
        {
            int temp = B - A[i];
            if(hm.containsKey(temp))
            {
                return new int[]{hm.get(temp),i+1};
            }
            hm.put(A[i],i+1);
        }
        return new int[]{-1,-1};
    }
}
