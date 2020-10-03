#include<iostream>
#include<math.h>
using namespace std;
struct complex
{
float rel;
float img;
}s1,s2;

int main()
{
    int ch;
    cin>>ch;
    if(ch>=1 && ch<=3)
    {
float a,b;
cin>>s1.rel>>s1.img;
cin>>s2.rel>>s2.img;

if(ch==1)
{
a=(s1.rel)+(s2.rel);
b=(s1.img)+(s2.img);
cout<<a<<"+"<<b<<"i";
}

else if(ch==2)
{
a=(s1.rel)-(s2.rel);
b=(s1.img)-(s2.img);
cout<<a<<"+"<<b<<"i";
}

else
{
 a=s1.rel*s2.rel-s1.img*s2.img;
 b=s1.img*s2.rel+s2.img*s1.rel;
cout<<a<<b<<"i";
}
       
    }
else
cout<<"Invalid choice";

return 0;
}