#include<iostream>
#include<algorithm>
using namespace std;

void Sort(int *arr1, int *arr2, int n)
{
    int i = 0, j = 0;
    while(i<n && j<n)
    {
        if(arr1[i]>arr2[j])
        {
            swap(arr1[i], arr2[j]);
            sort(arr2, arr2+n);
            i++;
        }
        else
            j++;
    }
}

void Print(int* arr, int n)
{
    for(int i = 0; i<n; i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
}

int main()
{
    int arr1[] = {10, 12, 14};
    int arr2[] = {1, 3, 5};
    int n = sizeof(arr1)/sizeof(arr1[0]);
    Sort(arr1, arr2, n);
    Print(arr1, n);
    Print(arr2, n);
    
    return 0;
}