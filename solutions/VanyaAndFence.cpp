#include <iostream>

int main() {

    int n;
    int h;
    int num = 0;
    int counter = 0;
    
    std::cin >> n >> h;
    
    for (int i = 0; i < n; i++) {
        std::cin >> num;
        if (num > h) {
            counter += 2;
        } else {
            counter++;
        }
    }

    std::cout << counter;

    return 0;
}