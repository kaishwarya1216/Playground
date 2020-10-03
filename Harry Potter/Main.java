#include<iostream>
using namespace std;
int main()
{
  int n,l,f,s=0;
  std::cin>>n;
  l=n%10;
  f=(n/1000)%10;
  s=f+l;
  cout<<s;
}