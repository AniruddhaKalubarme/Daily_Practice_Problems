#include<iostream>
#include<vector>
using namespace std;

void revStr(string str)
{
    vector<string> sentence;

    string temp = "", FinalStr = "";
    for(int i = 0; i<str.size(); i++)
    {
        

        if(str[i] == ' ')
        {
            sentence.push_back(temp);
            temp = "";
        }
        else
        {
            temp += str[i];
        }
    }

    sentence.push_back(temp);

    for(int i = sentence.size()-1; i>=0; i--)
    {
        FinalStr += sentence[i];
        if(i!=0)
            FinalStr += " ";
    }

    cout<<FinalStr<<endl;
}

int main()
{
    string str = "The sky is blue";
    revStr(str);
    return 0;
}