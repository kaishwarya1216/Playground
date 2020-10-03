#include<iostream>
using namespace std;
int main()
{
  int n,se=0,so=0,c=1,rev=0;
  cin>>n;
  while(n!=0)
  {
    rev=(rev*10)+(n%10);
    n=n/10;
  }
  n=rev;
  while(n!=0)
  {
    if(c%2==0)
      se +=n%10;
    else
      so +=n%10;
    n/=10;
    c++;
  }
  if(se==so)
    cout<<"Yes";
  else
    cout<<"No";
}