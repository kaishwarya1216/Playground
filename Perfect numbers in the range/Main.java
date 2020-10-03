#include<iostream>
using namespace std;
bool isPerfect(int no)
{
  int i=0;
  int sum=0;
  while(i++<no)
  {
    if(no%i==0 && i<no)
    {
      sum+=i;
    }
  }
  return sum==no;
}
int main()
{
  float f,s;
  std::cin>>f>>s;
  for(int i=f;i<=s;i++)
  {
    if(isPerfect(i))
    {
      cout<<i<<" ";
    }
  }
  return 0;
}