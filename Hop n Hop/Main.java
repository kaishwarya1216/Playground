#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x,y,a,b,c,sq;
  std::cin>>x>>y;
  a=pow((3-x),2);
  b=pow((4-y),2);
  c=a+b;
  sq=sqrt(c);
  cout<<sq;
}