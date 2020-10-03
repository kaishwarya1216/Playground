#include<iostream>
int main()
{
  int n,d=0;
  std::cin>>n;
  do
  {
    n=n/10;
    d++;
  }
  while(n!=0);
  std::cout<<d;
}