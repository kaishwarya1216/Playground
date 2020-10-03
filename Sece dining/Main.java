#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  int n;
  getline(cin,str);
  std::cin>>n;
  if(str=="front")
  {
    if(n==1)
      std::cout<<"Left Handed";
    else
      std::cout<<"Right Handed";
  }
  else
  {
    if(n==1)
    std::cout<<"Right Handed";
  else
    std::cout<<"Left Handed";
  }
}