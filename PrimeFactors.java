import java.util.*;

class PrimeFactors
{
    public static void main(String []arg)
    {
        ArrayList<Integer> factors = new ArrayList<>();
        int n = 123456;
        int i = 2;
        while(n!=1)
        {
            while(n%i == 0)
            {
                n = n/i;
                factors.add(i);
            }
            i++;
        }

        System.out.print('[');
        for(int j = 0; j<factors.size(); j++)
        {
            System.out.print(factors.get(j));
            if(j<factors.size()-1)
                System.out.print(", ");
        }
        System.out.print(']');
    }
}