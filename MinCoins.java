import java.util.*;

class MinCoins
{
    static void solve(int coins[], int n, int curr, int amount, int ans[], int coin)
    {
        if(curr == amount)
        {
            ans[0] = Math.min(ans[0], coin);
        }

        if(curr>amount)
            return;
        
        for(int i = 0; i<n; i++)
        {
            solve(coins, n, curr+coins[i], amount, ans, coin+1);
        }
    }

    public static void main(String arg[])
    {
        int arr[] = {1,2,5};
        int n = arr.length;
        int ans[] = {Integer.MAX_VALUE};
        int amount = 20;
        solve(arr, n, 0, amount, ans, 0);
        System.out.println(ans[0]);
    }
}