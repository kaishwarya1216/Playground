#include<iostream>
using namespace std;
int main()
{
  int num,sum=0,cnt,n;
  std::cin>>num;
  for(cnt=0;sum<num;cnt++)
  {
    std::cin>>n;
    sum=sum+n;
  }
  std::cout<<"The number of turns is "<<cnt;
  return 0;
}