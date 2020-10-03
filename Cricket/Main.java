#include<iostream>
#include<bits/stdc++.h>
#include<cmath>
using namespace std;
int main()
{
  int tot,totrun,run,ball,a;
  float ov,ovf,crr,trr,b;
  std::cin>>tot>>totrun>>run>>ball;
  ov=(tot)/6.0;
  a=ball/6.0;
  b=(ball%6)/10.0;
  ovf=(float(a))+b;
  crr=(float(run))/ovf;
  trr=float(totrun)/ov;
  std::cout<<ov<<"\n"<<ovf<<"\n";
  std::cout<<fixed<<setprecision(1)<<crr<<"\n";
  std::cout<<trr<<"\n";
  if(crr>=trr)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
}