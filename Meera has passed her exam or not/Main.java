#include<iostream>
using namespace std; 
int main()  
{
  int a[20],n,x,i,flag=0;   
  std::cin>>n;
	for(i=0;i<n;++i)
		std::cin>>a[i];
	std::cin>>x;
	for(i=0;i<n;++i)   
    {
		if(a[i]==x)  
        {
			flag=1;
			break;   
        }  
    }
	if(flag)
		std::cout<<"She passed her exam";
	else
		std::cout<<"She failed";
	return 0;
}