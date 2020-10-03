#include<iostream>
using namespace std;
int main()
{
  int i;
  float tim,ht,ht1;
  std::cin>>i;
  std::cin>>tim;
  if(i==2)
  {
    ht=tim*50/100;
    ht1=tim+ht;
    std::cout<<ht1;
  }
  else if(i==3)
  {
    ht=tim*2;
    std::cout<<ht;
  }
  else
    std::cout<<"Number of items is more";
}