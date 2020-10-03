#include<iostream>
using namespace std;
int main()
{
  int val=0;
  float sc=0.0;
  while(cin>>val)
  {
    if(val>0)
    {
      if(val%2!=0)
      {
        sc++;
      }
      else
      {
        sc=sc-0.5;
      }
    }
    else
    {
      sc=sc-1;
    }
  }
  std::cout<<sc;
}