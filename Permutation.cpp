#include<iostream>
#include<vector>
#include<set>
#include<string>
using namespace std;

void Permutation(string str, int n, set<string> &ans, string &temp, vector<int> &visited)
{
    if(temp.length() == n)
    {
        ans.insert(temp);
        return;
    }

    for(int i = 0; i<n; i++)
    {

        if(visited[i] == 0)
        {
            temp+=str[i];
            visited[i] = 1;
            Permutation(str, n, ans, temp, visited);
            visited[i] = 0;
            temp.pop_back();
        }
    }
}

int main()
{
    string str = "abc";
    set<string> ans;
    string temp = "";
    vector<int> visited(str.length(), 0);
    Permutation(str, str.length(), ans, temp, visited);

    for(auto i:ans)
    {
        cout<<i<<endl;
    }
    return 0;
}