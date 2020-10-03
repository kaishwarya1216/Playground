#include<iostream>
using namespace std;
int fib(int);
int main()
{
  int n;
  cin>>n;
  fib(n);
}
int fib(int n)
{
  int f=0,s=1,next,i;
  for(i=1;i<n-1;i++)
  {
    next=f+s;
    f=s;
    s=next;
  }
  cout<<"The term "<<n<<" in the fibonacci series is "<<next;
}