#include<iostream>
using namespace std;
int main()
{
	int a[30],b=0,c,d,n,m,i,e,f;
  	std::cin>>n>>m;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if((a[i]+a[i+1])>m)
    {
		b=b+1;
    }
    else
    {
      i++;
      b++;
    }
  }
  if(b==2)
  {
    b++;
  }
  std::cout<<b;
}