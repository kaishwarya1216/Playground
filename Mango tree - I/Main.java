#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r>>c>>n;
  if(n>=1 && n<=r)
  {
    std::cout<<"Yes";
  }
  else if(n%r==1)
  {
    std::cout<<"Yes";
  }
  else if(n<=r*c && n>r*c-r)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}