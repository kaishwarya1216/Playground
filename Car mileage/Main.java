#include<iostream>
using namespace std;
int main()
{
  float mil;
  int lit,d;
  std::cin>>mil>>lit>>d;
  if(float(d/lit)<mil)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}