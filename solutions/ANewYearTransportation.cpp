#include <iostream>
#include <vector>

int main() 
{
    int n;
    int t;
    int x = 0;
    
    std::cin >> n >> t;
    std::vector<int> nums(n);

    for (int i = 0 ; i < n - 1; ++i)
    {
        std::cin >> nums[i];
    }

   
    while (x < t - 1)
    {
        x += nums[x];
    }

    x == t - 1 ? std::cout << "YES" : std::cout << "NO";

    return 0;  
}