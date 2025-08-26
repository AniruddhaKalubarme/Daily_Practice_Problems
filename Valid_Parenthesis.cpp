#include<iostream>
#include<stack>
using namespace std;

bool Valid_Parenthesis(string str)
{
    stack<char> s;
    for(auto i:str)
    {
        if(i == '{' || i == '[' || i == '(')
        {
            s.push(i);
        }
        else if(!s.empty() && i == '}' && s.top() == '{')
        {
            s.pop();
        }
        else if(!s.empty() && i == ')' && s.top() == '(')
        {
            s.pop();
        }
        else if(!s.empty() && i == ']' && s.top() == '[')
        {
            s.pop();
        }
        else
        {
            return false;
        }
    }

    if(s.empty())   return true;
    else    return false;

}

int main()
{
    string str = "{[()]}";
    cout<<Valid_Parenthesis(str)<<endl;
    return 0;
}