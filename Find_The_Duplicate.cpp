#include <iostream>
using namespace std;

int Duplicate_Element(int *arr)
{
    int slow = arr[0], fast = arr[0];
    do
    {
        slow = arr[slow];
        fast = arr[arr[fast]];
    }while(slow != fast);

    slow = arr[0];

    while(slow != fast)
    {
        slow = arr[slow];
        fast = arr[fast];
    }

    return slow;
}

int main()
{
    int arr[] = {3,3,1,4,2};
    cout<<Duplicate_Element(arr);
    return 0;
}