#include <iostream>
#include <cmath>

int main() {

    long long n;
    long long m;
    long long a;
    long long value;

    std::cin >> n >> m >> a;
    value = ceil((double) n / a) * ceil((double) m / a);
    std::cout << value;

    return 0;
}