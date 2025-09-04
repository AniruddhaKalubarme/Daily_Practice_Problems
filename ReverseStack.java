import java.util.*;


class ReverseStack
{
    static void PlaceNumber(Stack<Integer> s, int x)
    {
        if(s.empty())
        {
            s.push(x);
            return;
        }

        int iNo = s.pop();
        PlaceNumber(s, x);
        s.push(iNo);
    }

    static void Reverse(Stack<Integer> s)
    {
        if(s.empty())
            return;
        
        int x = s.pop();
        Reverse(s);
        PlaceNumber(s, x);
    }

    public static void main(String []arg)
    {
        Stack<Integer> s = new Stack<>();
        s.push(-15);
        s.push(-10);
        s.push(-5);
        // s.push(1);

        Reverse(s);

        while(!s.empty())
        {
            System.out.print(s.pop() + ", ");
        }
    }
}