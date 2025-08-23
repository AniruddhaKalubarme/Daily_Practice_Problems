#include<iostream>
#include<string>
using namespace std;

string Common_Prefix(string *arr, int n)
{
    if(n==0) return "";
    if(n==1) return arr[0];
    string str = "";

    bool flag = false;
    for(int i = 0; ; i++)
    {
        char ch = arr[0][i];
        for(int j = 0; j<n; j++)
        {
            if(arr[j].size() <= i || arr[j][i] != ch)
            {
                flag = true;
                break;
            }
        }
        
        if(flag) break;
        str += ch;
    }

    return str;
}

int main()
{
    string arr[] = {"flower", "flow", "flight"};
    cout<<Common_Prefix(arr, sizeof(arr)/sizeof(arr[0]));
    return 0;
}