#include<iostream>
using namespace std;
int main()
{
  int n,r,sum=0,temp;
  std::cin>>n;
  temp=n;
  while(n!=0)
  {
    r=n%10;
    n=n/10;
    sum=sum+r;
  }
  if(temp%sum==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}