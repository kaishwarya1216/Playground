#include<iostream>
int main()
{
  int n,i;
  float s=0.5;
  std::cin>>n;
  if(n==1)
    std::cout<<s;
  else
  {
    std::cout<<s<<" ";
    for(i=1;i<n;i++)
    {
      s=s*3;
      std::cout<<s<<" ";
    }
  }
}