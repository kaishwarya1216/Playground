#include<iostream>
using namespace std;
int main()
{
  int n,x=11,i,s;
  std::cin>>n;
  std::cout<<x*x<<" ";
  for(i=1;i<n;i++)
  {
    x=x+4;
    s=x*x;
    std::cout<<s<<" ";
  }
}