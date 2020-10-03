#include<iostream>
using namespace std;
int main()
{
  int fc,fd,fs,ac,ad,as,sc,sd,ss,flip,snap,ama,f,s,a;
  std::cin>>fc>>fd>>fs>>sc>>sd>>ss>>ac>>ad>>as;
  f=fc*fd/100;
  s=sc*sd/100;
  a=ac*ad/100;
  flip=fc+fs-f;
  snap=sc+ss-s;
  ama=ac+as-a;
  std::cout<<"In Flipkart Rs."<<flip<<"\n";
  std::cout<<"In Snapdeal Rs."<<snap<<"\n";
  std::cout<<"In Amazon Rs."<<ama<<"\n";
  if((flip<=snap)&&(flip<=ama))
    std::cout<<"He will prefer Flipkart \n";
  else if((snap<=flip)&&(snap<=ama))
    std::cout<<"He will prefer Snapdeal \n";
  else
    std::cout<<"He will prefer Amazon \n";
}