#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,sd,sc,r=0;
  std::cin>>d1>>c1>>d2>>c2;
  sc=c1+c2;
  if(sc>=100)
  {
    r=sc/100;
    sc=sc%100;
  }
  sd=d1+d2+r;
  std::cout<<sd<<"\n"<<sc;
}