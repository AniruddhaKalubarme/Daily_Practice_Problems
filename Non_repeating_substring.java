import java.util.*;

class Non_repeating_substring{
    static int Find_String(String str)
    {
        int iMax = 1;
        for(int i = 0; i<str.length(); i++)
        {
            int iCnt = 0;
            Map<Character, Boolean> visited = new HashMap<>();
            for(int j = i; j<str.length(); j++)
            {
                visited.put(str.charAt(j), false);
            }
            for(int j = i; j<str.length(); j++)
            {
                if(visited.get(str.charAt(j)) == false)
                {
                    visited.put(str.charAt(j), true);
                    iCnt++;
                }
                else
                {
                    break;
                }
            }

            iMax = Math.max(iCnt, iMax);
        }

        return iMax;
    }
    public static void main(String []arg)
    {
        System.out.println(Non_repeating_substring.Find_String("abcdefgh"));
        System.out.println(Non_repeating_substring.Find_String("pwwkew"));
        System.out.println(Non_repeating_substring.Find_String("bbbb"));
        System.out.println(Non_repeating_substring.Find_String("abcabcbb"));
        System.out.println(Non_repeating_substring.Find_String("a"));
    }
}