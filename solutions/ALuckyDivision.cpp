#include <iostream>
#include <string>

int main() {

    std::string num; 
    int counter = 0;

    std::cin >> num;

    for (int i = 0; i < num.length(); ++i) {
        
        if (num[i] == '4' || num[i] == '7') {
            counter++;
        } 
    }
    
    (counter == num.length() || (std::stoi(num) % 4 == 0 || std::stoi(num) % 7 == 0 || std::stoi(num) % 47 == 0)) ? std::cout << "YES" : std::cout << "NO";
    

    return 0;
}