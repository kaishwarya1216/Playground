#include<iostream>
using namespace std;
int main()
{
  int n,size,fib[100],i;
  std::cin>>n;
  fib[0]=0;
  fib[1]=1;
  for(i=2;i<n;i++)
  {
    fib[i]=fib[i-1]+fib[i-2];
  }
  std::cout<<fib[n-1];
}