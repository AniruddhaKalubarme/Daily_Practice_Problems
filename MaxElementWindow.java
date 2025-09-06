import java.util.*;

public class MaxElementWindow{
    public static void main(String[] args){
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        k--;
        int n = arr.length;
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++)
        {     
            if(dq.isEmpty())
            {
                dq.addLast(i);
            }

            if(dq.peekFirst() < i-k)
                dq.removeFirst();
            
            while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()])
                dq.removeLast();

            dq.addLast(i);

            if(i-k>=0)
                System.out.println(arr[dq.peekFirst()]);
        }
    }
}