#include <iostream>
#include <string>


int main() {
    
    std::string word;
    std::string hello = "hello";
    int j = 0;

    std::cin >> word;

    for (int i = 0; i < word.length(); ++i) {
        if (word[i] == hello[j]) {
            ++j;
        }
    }

    j == hello.length() ? std::cout << "YES" : std::cout << "NO";

    return 0;
}