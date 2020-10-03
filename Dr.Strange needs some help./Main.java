#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int m,n,req,s;
  cin>>m>>n>>req;
  s=pow(m,n);
  if(s>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}