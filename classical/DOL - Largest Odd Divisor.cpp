//Problem URL : http://www.spoj.com/problems/DOL/

#include <iostream>
using namespace std;

int main()
{
      int t;
      long long int n;
      cin>>t;
      for(int i=1;i<=t;i++)
      {
        cin>>n;
      if(n%2==1)
        cout<<"Case "<< i <<": "<<n<<'\n';
      else
      {  
         while(n%2==0)
          {
              n=n/2;
          }
         cout<<"Case "<< i <<": "<<n<<'\n';
      } 
     }
    
}

