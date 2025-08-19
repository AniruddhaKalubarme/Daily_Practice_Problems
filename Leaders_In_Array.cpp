#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

vector<int> Leaders(int *arr, int n)
{
    vector<int> vec;

    int iMax = -1;

    for(int i = n-1; i>=0; i--)
    {
        iMax = max(arr[i], iMax);
        if(iMax == arr[i])
            vec.push_back(arr[i]);
    }

    return vec;
}

void PRINT(vector<int> vec)
{
    for(auto i:vec)
        cout<<i<<"\t";
    cout<<endl;
}

int main()
{
    int arr[] = {16,17,4,3,5,2};
    int n = sizeof(arr)/sizeof(arr[0]);

    vector<int> vec = Leaders(arr, n);
    reverse(vec.begin(), vec.end());
    PRINT(vec);
    
    return 0;
}