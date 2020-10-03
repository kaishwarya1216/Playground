#include<iostream>
using namespace std;
int main()
{
  int x1,y1,x2,y2,x3,y3;
  float a,b;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  a=float(x1+x2+x3)/3.0;
  b=float(y1+y2+y3)/3.0;
  cout<<a<<"\n"<<b;
}