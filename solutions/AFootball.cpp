#include <iostream>
#include <string>

int main() 
{
    int n;
    int counter = 0;
    int max = 0;
    std::string team;
    std::string bestTeam;
    
    std::cin >> n;

    std::string arr[n];

    for (int i = 0; i < n; ++i) 
    {
        std::cin >> arr[i];
    }

    for (int i = 0; i < n; ++i)
    {
        team = arr[i];

        for (int j = 0; j < n; ++j)
        {
            if (arr[j] == team)
            {
                counter++;
            }
            
            if (counter > max)
            {
                max = counter;
                bestTeam = team;
            }
        }
        counter = 0;
    }
    
    std::cout << bestTeam;
    return 0;
}
