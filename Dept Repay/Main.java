#include<iostream>
using namespace std;
int main()
{
  int X,R,Y;
  float s,a,b,d;
  std::cin>>X>>R>>Y;
  s=(X*R*Y)/100;
  a=X+s;
  d=s*2/100;
  b=a-d;
  std::cout<<s<<"\n"<<a<<"\n"<<d<<"\n"<<b;
}