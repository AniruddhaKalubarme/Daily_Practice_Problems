#include<iostream>
#include<vector>
using namespace std;

void SubArrZrr(int *arr, int n)
{
    int iSum = 0;
    int *iSumArr = new int[n];

    for(int i = 0; i<n; i++)
    {
        iSum+=arr[i];
        iSumArr[i] = iSum;
    }

    vector<pair<int, int>> pairs;

    for(int i = 0; i<n; i++)
    {
        if(iSumArr[i] == 0)
        {
            pairs.push_back(make_pair(0,i));
        }
        for(int j = i+1; j<n; j++)
        {
            if(iSumArr[i] == iSumArr[j])
                pairs.push_back(make_pair(i+1,j));
        }
    }

    for(int i = 0; i<pairs.size(); i++)
    {
        cout<<pairs[i].first<<", "<<pairs[i].second<<endl;
    }
}

int main()
{
    int arr[] = {4, -1, -3, 1, 2, -1};
    int n = sizeof(arr)/sizeof(arr[0]);

    SubArrZrr(arr, n);
    return 0;
}