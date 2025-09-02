import java.util.*;

class Postfix
{
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String []atr)
    {
        Stack<Integer> s = new Stack<>();

        String str = "3 4 2 * 1 5 - 2 3 ^ ^ / +";
        String []parts = str.split(" ");

        int op1 = 1, op2 = 1;
        for(String part:parts)
        {
            if(isNumber(part))
            {
                s.push(Integer.parseInt(part));
            }
            else if(part=="*")
            {
                op2 = s.pop();
                op1 = s.pop();

                s.push(op1 * op2);
            }
            else if(part=="/")
            {
                op2 = s.pop();
                op1 = s.pop();

                s.push(op1 / op2);                
            }
            else if(part=="+")
            {
                op2 = s.pop();
                op1 = s.pop();

                s.push(op1 + op2);                
            }
            else if(part=="-")
            {
                op2 = s.pop();
                op1 = s.pop();

                s.push(op1 - op2);                
            }
            else if(part=="^")
            {
                op2 = s.pop();
                op1 = s.pop();

                s.push((int)(Math.pow(op1, op2)));                
            }
        }

        System.out.println(s.pop());
    }
}