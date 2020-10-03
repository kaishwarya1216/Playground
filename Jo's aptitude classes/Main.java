#include<iostream>
using namespace std;
int main()
{
  int small=0,gcd=0,a,b,c,ans;
  cin>>a>>b>>c>>ans;
  if(a<b && a<c)
    small=a;
  else if(b<a && b<c)
    small=b;
  else
    small=c;
  while(small>=1)
  {
    if(a%small==0 && b%small==0 && c%small==0)
    {
      gcd=small;
      break;
    }
    small--;
  }
  if(small==ans)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}