#include<iostream>
using namespace std;
int main()
{
  int n,p;
  std::cin>>n;
  if(n<=200)
  {
    p=0.5*n;
  }
  else if(n<=400)
  {
    p=(0.65*n)+100;
  }
  else if(n<=600)
  {
    p=(0.80*n)+200;
  }
  else
  {
    p=(1.25*n)+425;
  }
  std::cout<<"Rs."<<p;
}