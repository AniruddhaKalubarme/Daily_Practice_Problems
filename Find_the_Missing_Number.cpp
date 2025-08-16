#include<iostream>
using namespace std;

int Find_Missing_Element(int *arr, int n)
{

    for(int i = 0; i<n; i++)
    {
        if(arr[i] != i+1)
        {
            return i+1;
        }
    }

    return n+1;
}

int main()
{
    int arr1[] = {1,2,4,5};
    int arr2[] = {2,3,4,5};
    int arr3[] = {1,2,3,4};
    int arr4[] = {1};

    cout<<Find_Missing_Element(arr1, sizeof(arr1) / sizeof(arr1[0]))<<endl;
    cout<<Find_Missing_Element(arr2, sizeof(arr2) / sizeof(arr2[0]))<<endl;
    cout<<Find_Missing_Element(arr3, sizeof(arr3) / sizeof(arr3[0]))<<endl;
    cout<<Find_Missing_Element(arr4, sizeof(arr4) / sizeof(arr4[0]))<<endl;

    return 0;
}