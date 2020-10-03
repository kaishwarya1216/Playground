#include<iostream>
using namespace std;
int main()
{
    int n;
  std::cout<<"Enter the number of elements in the array\n";
    std::cin>>n;
    int arr[n];
    int i;
  std::cout<<"Enter the elements in the array\n";
    for(i = 0; i < n; i++)
    {
        std::cin>>arr[i];
    }
    int pos;
  std::cout<<"Enter the location where you wish to insert an element\n";
    std::cin>>pos;
    int ele;
    if(pos > n)
        std::cout<<"Invalid Input";
     else
    {
       std::cout<<"Enter the value to insert\n";
    std::cin>>ele;
        for (i = n - 1; i >= pos - 1; i--)
            arr[i+1] = arr[i];
        arr[pos-1] = ele;
        std::cout << "Array after insertion is\n";
        for (i = 0; i <= n; i++)
            std::cout << arr[i] << "\n";
    }
    return 0;
}