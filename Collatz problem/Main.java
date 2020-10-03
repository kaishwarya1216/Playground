#include<iostream>
using namespace std;
int main()
{
  int n,n1,count=0;
  std::cin>>n;
  std::cout<<n<<"\n";
  while(n>1)
  {
    if(n%2==0)
    {
      n1=n/2;
      std::cout<<n1<<"\n";
    }
    else
    {
      n1=3*n+1;
      std::cout<<n1<<"\n";
    }
    n=n1;
    count++;
  }
  std::cout<<count;
}