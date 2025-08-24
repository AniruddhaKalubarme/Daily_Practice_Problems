#include<iostream>
#include<algorithm>
#include<vector>
#include<set>
using namespace std;

void Anagrams(string *arr, int n)
{
    vector<string> vec(n);
    set<string> st;
    
    for(int i = 0; i<n; i++)
    {
        vec[i] = arr[i];
    }

    for(int i = 0; i < n; i++)
    {
        sort(arr[i].begin(), arr[i].end());
        st.insert(arr[i]);
    }


    vector<vector<string>> final_Ans;
    for(auto it : st)
    {
        vector<string> ans;
        for(int j = 0; j<n; j++)
        {
            if(it == arr[j])
                ans.push_back(vec[j]);
        }

        final_Ans.push_back(ans);
    }

    cout<<"{ ";
    for(int i = 0; i<final_Ans.size(); i++)
    {
        cout<<"{";
        for(int j = 0; j<final_Ans[i].size(); j++)
        {
            cout<<final_Ans[i][j];
            if(j != final_Ans[i].size()-1) 
            cout<<", ";
        }

        if(i != final_Ans.size()-1)
            cout<<"}, ";
        else
            cout<<"}";
    }
    cout<<" }";
}

int main()
{
    // string str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
    // string str[] = {""};
    // string str[] = {"abc", "bca", "cab", "xyz", "zyx", "yxz"};
    string str[] = {"abc", "def", "ghi"};
    int n = sizeof(str)/sizeof(str[0]);

    Anagrams(str, n);
    return 0;
}