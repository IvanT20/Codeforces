#include <iostream>

int main() 
{

    int n;
    int counter = 0;

    std::cin >> n;

    while (n / 2 != 0)
    {
        if (n % 2 == 1)
        {
            counter++;
        }

        n /= 2;
    }

    std::cout << counter + 1;
    return 0;
}