#include<iostream>
using namespace std;
int main()
{
  int age;
  float tim;
  std::cin>>age>>tim;
  if(tim>13 && tim<=18)
  {
    if(age>13)
    {
      std::cout<<"$5.00";
    }
    else
    {
      std::cout<<"$2.00";
    }
  }
  else if(age>13)
  {
    std::cout<<"$8.00";
  }
  else
  {
    std::cout<<"$4.00";
  }
}