#include<iostream>
using namespace std;
int main()
{
  int i,j,r,c,n;
  cin>>r>>c>>n;
  if(n%c==0)
  {
    if(((n/c)==(c-1))||((n/c)==((c-(c-2)))))
      std::cout<<"It is a mango tree";
    else
      std::cout<<"It is not a mango tree";
  }
  else
  {
    std::cout<<"It is not a mango tree";
  }
}