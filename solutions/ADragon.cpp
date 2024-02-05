#include <iostream>
#include <algorithm>
#include <utility>

int main() {

    int s;
    int n;

    std::cin >> s >> n;

    std::pair<int, int> d[n];
    
    for (int i = 0; i < n; ++i) 
    {
        std::cin >> d[i].first >> d[i].second;
    }
    
    std::sort(d, d + n);

    for (int i = 0; i < n; ++i) 
    {
        if (s > d[i].first)
        {
            s += d[i].second;
            if (i == n - 1) 
            {
                std::cout << "YES";
            }
        } 
        else 
        {
            std::cout << "NO";
            break;
        }
    }
    return 0;
}