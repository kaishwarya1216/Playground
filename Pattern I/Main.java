#include<iostream>
int main()
{
  int n,i,j;
  std::cin>>n;
  for(i=0;i<4;i++)
  {
    for(j=0;j<=i;j++)
    {
      std::cout<<n+i;
    }
    std::cout<<"\n";
  }
  for(i=3;i>=0;i--)
  {
    for(j=0;j<=i;j++)
    {
      std::cout<<n+i;
    }
    std::cout<<"\n";
  }
}