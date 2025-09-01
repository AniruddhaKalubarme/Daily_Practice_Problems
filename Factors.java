import java.util.*;

class Factors
{
    public static int FactorsOfN(int n)
    {
        int i = 1;
        int iCnt = 0;

        for(i = 1; i*i<n; i++)
        {
            if(n%i == 0)
            {
                iCnt+=2;
            }
        }

        if(i*i == n)
            iCnt++;

        return iCnt;
    }

    public static void main(String []str)
    {
        int n = 12;
        
        System.out.println(Factors.FactorsOfN(n));
    }
}