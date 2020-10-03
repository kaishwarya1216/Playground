#include<iostream>
using namespace std;
int main()
{
  int sum=0,n,s,a[10];
  std::cin>>n>>s;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if(sum<=s)
  {
    std::cout<<"YES";
  }
  else
  {
    std::cout<<"NO";
  }
  return 0;
}