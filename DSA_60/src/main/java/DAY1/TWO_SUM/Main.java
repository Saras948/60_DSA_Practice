package DAY1.TWO_SUM;

/*Given an array of integers, find two numbers such that they add up to a specific target number.
  The function twoSum should return indices of the two numbers such that they add up to the target,
  where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based.
  Put both these numbers in order in an array and return the array from your function ( Looking at the function
  signature will make things clearer ). Note that, if no pair exists, return an empty list.

  If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the
  minimum index2, choose the one with minimum index1 out of them.
        Problem Constraints
        1 <= |A| <= 105
        -10^8 <= Ai <= 10^8
        -10^8 <= B <= 10^8


        Input Format
        The first argument is an integer array A.
        The second argument is an integer B.


        Output Format
        Return an array of integer, representing the answer


        Example Input
        A: [2, 7, 11, 15]
        B: 9


        Example Output
        [1, 2]


        Example Explanation
        The elements present at index 1 and index 2 add up to 9. i.e. A[1] + A[2] = 9 (1-based indexing)

*/
public class Main {
    public static void main(String[] args) {
        int[] A = {2,7,11,15};
        int B = 9;
        int[] ans = twoSum(A,B);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] twoSum(final int[] A,int B)
    {
//        int[] result = new int[2];
        int length = A.length;
        for(int i = 0; i< length; i++)
        {
            for(int j=i+1; j<length; j++)
            {
                if(A[i]+A[j]==B)
                {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
