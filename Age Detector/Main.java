#include<iostream>
using namespace std;
int main()
{
  int b,c,age;
  std::cin>>b>>c;
  if(b<c)
  {
    age=c-b;
  }
  else
  {
    b=1900+b;
    c=2000+c;
    age=c-b;
  }
  std::cout<<age;
}