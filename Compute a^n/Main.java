#include<iostream>
using namespace std;
int pow(int,int);
int main()
{
  int a,n;
  std::cout<<"Enter the value of a\n";
  std::cin>>a;
  std::cout<<"Enter the value of n\n";
  std::cin>>n;
  pow(a,n);
}
int pow(int a,int n)
{
  int res=1;
  for(int i=1;i<=n;i++)
  {
    res=res*a;
  }
    std::cout<<"The value of "<<a<<" power "<<n<<" is "<<res;
  }