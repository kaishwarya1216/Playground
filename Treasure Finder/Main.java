#include<iostream>
using namespace std;
int main()
{
  int a,b,c,i,gcd;
  std::cin>>a>>b>>c;
  if((a>b && a<c)||(a<b && a>c))
    std::cout<<"The treasure is in box which has number "<<a<<"\n";
  else if((b>c && b<a)||(b<c && b>a))
    std::cout<<"The treasure is in box which has number "<<b<<"\n";
  else
    std::cout<<"The treasure is in box which has number "<<c<<"\n";
  for(i=1;i<=a && i<=b && i<=c;i++)
  {
    if(a%i==0 && b%i==0 && c%1==0)
      gcd=i;
  }
  std::cout<<"The code to open the box is "<<gcd;
}