#include<iostream>
using namespace std;
int main()
{
  int w,a,c,t1,t2;
  std::cin>>w>>a>>c;
  t1=75*a;
  t2=30*c;
  if(w>(t1+t2))
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
}