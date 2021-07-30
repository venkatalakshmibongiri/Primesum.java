import java.util.*;
import java.lang.*;
import java.io.*;
class Primesum
{
            static int N=500000;
            public static int prime[ ]=new int[N];
            public static int arr[ ]=new int[N];
            public static void sieve( )
            {
                for(int i=0;i<N;i++)
                {
                   prime[i]=1;
                }
                 prime[0]=0;
                 prime[1]=0;
                 for(int i=2;i*i<N;i++)
                {
                      if(prime[i]==1)
                      {
                         for(int j=i*i;j<N;j+=i)
                         {
                             prime[j]=0;
                         }
                      }
                }
         }
public static void main(String args[ ]) throws java.lang.Exception
{
             sieve( ); 
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter number of test cases");
             int tc=sc.nextInt( );
             for(int j=0;j<tc;j++)
             {
                int n=sc.nextInt();
                int n1=0;
                for(int i=0;i<=n;i++)
                {
                  if((prime[i]==1) && (prime[n-i]==1))
                  {
                   n1=i+(n-i);
                  }
                }
                  if(n1==n)
                   System.out.println("Deepa");
                  else
                   System.out.println("Arjit");
             }    
}
}

Output______________________________________________________________________________________________________________
Enter number of test cases
3
8
Deepa
5
Deepa
7
Deepa