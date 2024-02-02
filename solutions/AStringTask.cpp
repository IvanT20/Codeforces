#include <iostream>
#include <string>

int main() {

    std::string word;
    std::string newWord;
    std::string period(1, '.');

    std::cin >> word;

    for (int i = 0; i < word.size(); i ++) {
        word[i] = std::tolower(word[i]);
    }
    
    for (int i = 0; i < word.size(); i++) {
        if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u' || word[i] == 'y') {
            continue;
        }
        newWord = newWord + period + word[i];
    }

    std::cout << newWord;
    return 0;
}