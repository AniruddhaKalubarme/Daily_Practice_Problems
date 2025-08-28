import java.util.*;

class sequence
{
    static void find_Subsequence(String str, int k)
    {
        int n = str.length();
        Set<Character> s = new HashSet<>();
        int iCnt = 0;

        for(int i = 0; i<n; i++)
        {
            for(int j = i+k; j<=n; j++)
            {
                String temp = str.substring(i, j);

                for(int l = 0; l<temp.length(); l++)
                {
                    s.add(temp.charAt(l));
                }

                if(s.size() == k)
                {
                    iCnt++;
                    System.out.println(temp);
                    
                }
                
                s.clear();
            }
        }

        System.out.println(iCnt);
    }

    public static void main(String arg[])
    {
        String str = "pqpqs";
        str = "aabacbebebe";
        int k = 3;

        sequence.find_Subsequence(str, k);
    }
}