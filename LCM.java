class LCM
{
    static long GCD(long a, long b)
    {
        if(b == 0)
            return a;
        
        return GCD(b, a%b);
    }

    static long LCMFind(long a, long b)
    {
        return ((a*b)/GCD(a, b));
    }

    public static void main(String str[])
    {
        long a = 123456 , b = 789012;
        System.out.println(LCM.LCMFind(a, b));
    }
}