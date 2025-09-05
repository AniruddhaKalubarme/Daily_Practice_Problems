import java.util.*;

class FirstKelement
{
    static int FindElement(int arr[], int k, int n)
    {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i<n; i++)
        {
            if(mp.containsKey(arr[i]))
            {
                int temp = mp.get(arr[i]);
                mp.put(arr[i], ++temp);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> key : mp.entrySet())
        {
            if(key.getValue() == k)
                return key.getKey();
        }

        return -1;
    }

    public static void main(String []arg)
    {
        int k = 3;
        // int arr[] = {2, 3, 4, 2, 2, 5, 5};
        // int arr[] = {1, 1, 1, 1};
        int arr[] = {6, 6, 6, 6, 7, 7, 8, 8, 8};

        System.out.println(FindElement(arr, k, arr.length));
    }
}

// Optimised
import java.util.*;

class FirstKelement {
    static int FindElement(int arr[], int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int num : arr)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        // Return the first element in order of appearance that occurs k times
        for (int num : arr)
            if (freq.get(num) == k)
                return num;

        return -1;
    }

    public static void main(String[] args) {
        int k = 2;
        int arr[] = {2, 3, 4, 2, 2, 5, 5};

        System.out.println(FindElement(arr, k)); 
    }
}
