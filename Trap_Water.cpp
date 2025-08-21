#include<iostream>
#include<vector>
using namespace std;


int trap(vector<int> height) {
    int n = height.size();
    if (n == 0) 
    {
        return 0;
    }

    vector<int> left(n);
    vector<int> right(n);

    int maxLeft = 0, maxRight = 0;

    for (int i = 0; i < n; ++i) {
        maxLeft = max(maxLeft, height[i]);
        left[i] = maxLeft;
    }

    for (int i = n - 1; i >= 0; --i) {
        maxRight = max(maxRight, height[i]);
        right[i] = maxRight;
    }

    int Total_Water = 0;
    for (int i = 0; i < n; ++i) {
        Total_Water += min(left[i], right[i]) - height[i];
    }

    return Total_Water;
}

int main()
{
    vector<int> height = {4, 2, 0, 3, 2, 5};
    cout<<trap(height)<<endl;
    return 0;
}