#include<iostream>
using namespace std;
int fact(int);
int main()
{
  int n;
  cin>>n;
  fact(n);
}
int fact(int n)
{
  int i,f=1;
  for(i=1;i<=n;i++)
  {
    f=f*i;
  }
  cout<<"The factorial of "<<n<<" is "<<f;
}