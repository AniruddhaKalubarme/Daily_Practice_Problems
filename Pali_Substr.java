import java.util.*;

class Pali_Substr
{
    static void Chk_pali(int arr[], String str)
    {
        while(arr[0] >= 0 && arr[1] < str.length() && str.charAt(arr[0]) == str.charAt(arr[1]))
        {
            int length = arr[1] - arr[0] + 1;
            if(length > arr[3])
            {
                // System.out.println(length);
                arr[2] = arr[0];
                arr[3] = length;
            }
            arr[0]--;
            arr[1]++;
        }
    }

    static String Find_palindrome(String str)
    {
        int arr[] = new int[4];
        arr[2] = 0;
        arr[3] = 1;
        for(int i = 0; i<str.length(); i++)
        {
            arr[0] = i; arr[1] = i;
            Pali_Substr.Chk_pali(arr, str);
            arr[0] = i; arr[1] = i+1;
            Pali_Substr.Chk_pali(arr, str);
        }

        return str.substring(arr[2], arr[2] + arr[3]);
    }

    public static void main(String arg[])
    {
        String str = "abaaba";
        str = "a";
        str = "bbbb";
        String ans = Pali_Substr.Find_palindrome(str);

        System.out.println(ans);
    }
}