#include<iostream>
using namespace std;
int main()
{
  int su,m,tu,w,t,f,s,tot,su1,su2,s1,s2;
  std::cin>>su>>m>>tu>>w>>t>>f>>s;
  if(su>=1)
  {
    su1=su*100;
    su2=su1*50/100+su1;
  }
  if(m<=8)
    m=m*100;
  else
    m=m*100+(m-8)*15;
  if(tu<=8)
    tu=tu*100;
  else
    tu=tu*100+(tu-8)*15;
  if(w<=8)
    w=w*100;
  else
    w=w*100+(w-8)*15;
  if(t<=8)
     t=t*100;
  else t=t*100+(t-8)*15;
  if(f<=8)
    f=f*100;
  else
    f=f*100+(f-8)*15;
  if(s>=1)
  {
    s1=s*100;
    s2=s1*25/100+s1;
  }
  tot=su2+m+tu+w+t+f+s2;
  std::cout<<tot;
}