import java.util.*;

class SortStack
{
    static void PlaceElement(Stack<Integer> s, int iNo)
    {
        if(s.empty() || s.peek()>iNo)
        {
            s.push(iNo);
            return;
        }

        int x = s.pop();
        PlaceElement(s, iNo);
        s.push(x);
    }

    static void Sort(Stack<Integer> s)
    {
        if(s.empty())
            return;
        
        int iNo = s.pop();
        Sort(s);
        PlaceElement(s, iNo);
    }

    public static void main(String []arg)
    {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);

        Sort(s);

        while(!s.empty())
        {
            System.out.println(s.pop());
        }
    }
}