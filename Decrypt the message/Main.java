#include<iostream>
using namespace std;
int main()
{
  int a,b,sum,sum1=0,i;
  cin>>a>>b;
  sum=a+b;
  for(i=1;i<sum;i++)
  {
    if(sum%i==0)
    {
      sum1=sum1+i;
    }
  }
  if(sum==sum1)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}