package DAY1;
/*  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

    Example 1:

    Input: s = "()"
    Output: true
    Example 2:

    Input: s = "()[]{}"
    Output: true
    Example 3:

    Input: s = "(]"
    Output: false


    Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'
*/
public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "([{}]))";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String Data)
    {
        int[] symbolFreq = new int[3];
        int len = Data.length();
        for(int i= 0; i<len; i++)
        {
            if(Data.charAt(i)=='('||Data.charAt(i)=='{'||Data.charAt(i)=='[')
            {
                if(Data.charAt(i)=='(')
                    symbolFreq[0]++;
                if(Data.charAt(i)=='[')
                    symbolFreq[1]++;
                if(Data.charAt(i)=='{')
                    symbolFreq[2]++;
            }
            else
            {
                if (Data.charAt(i)==')')
                    symbolFreq[0]--;
                if (Data.charAt(i)==']')
                    symbolFreq[1]--;
                if (Data.charAt(i)=='}')
                    symbolFreq[2]--;
            }
        }
        for(int i : symbolFreq)
            if(i!=0)return false;
        return true;
    }
}
