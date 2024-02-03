#include <iostream>

int main() {

    int a;
    int b;
    int c;

    std::cin >> a >> b >> c;

    int equationOne = a + (b * c) ;
    int equationTwo = a * (b + c);
    int equationThree = a * b * c;
    int equationFour = (a + b) * c;
    int equationFive = a + b + c;

    if (equationOne >= equationTwo && equationOne >= equationThree && equationOne >= equationFour && equationOne >= equationFive) {
        std::cout << equationOne;
    } else if (equationTwo >= equationOne && equationTwo >= equationThree && equationTwo >= equationFour && equationTwo >= equationFive) {
        std::cout << equationTwo;
    } else if (equationThree >= equationOne && equationThree >= equationTwo && equationThree >= equationFour && equationThree >= equationFive) {
        std::cout << equationThree;
    } else if (equationFour >= equationOne && equationFour >= equationTwo && equationFour >= equationThree && equationFour >= equationFive) {
        std::cout << equationFour;
    } else if (equationFive >= equationOne && equationFive >= equationTwo && equationFive >= equationThree && equationFive >= equationFour) {
        std::cout << equationFive;
    }

    return 0;

}