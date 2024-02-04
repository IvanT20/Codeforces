#include <iostream>
#include <cctype>
#include <string>

int main() 
{

    std::string word;
    int counter = 0;
    
    std::cin >> word;

    for (int i = 0; i < word.length(); ++i)
    {
        if (isupper(word[i + 1])) 
        {
            counter++;
        }
    } 

    if (counter == word.length() - 1) 
    {
        for (int i = 0; i < word.length(); ++i) {
            word[i + 1] = std::tolower(word[i + 1]);
        }

        if (isupper(word[0]))
        {
            word[0] = std::tolower(word[0]);
        } 
        else 
        {
             word[0] = std::toupper(word[0]);
        }
           
    }

    std::cout << word;

    return 0;
}