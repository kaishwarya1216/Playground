#include <iostream>
using namespace std;
void reverse(const string& a);
int main()
{
    string str;
    getline(cin, str);
    reverse(str);
    return 0;    
}
void reverse(const string& str)
{
    size_t numOfChars = str.size();
    if(numOfChars == 1)
       std::cout << str << endl;
    else
    {
       std::cout << str[numOfChars - 1];
       reverse(str.substr(0, numOfChars - 1));
    }
}