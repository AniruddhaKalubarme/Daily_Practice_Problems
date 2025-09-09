import java.util.*;

class CycleDetection
{
    static boolean isCycle(int v, int edges[][]){
        for(int i = 0; i<edges.length; i++)
        {
            if(edges[i][1] == edges[0][0])
                return true;
        }

        return false;
    }

    public static void main(String []arg)
    {
        int v = 5;
        int edges[][] = {{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 0}};

        System.out.println(isCycle(v, edges));
    }
}