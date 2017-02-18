
public class PrimeFactors
{
public static void main(String[] args) 
{
int n=Integer.parseInt(args[0]);
System.out.print("The Prime Factors of "+n+" are : ");
for(int i=2;i<=n/2;i++)
  {
   if(n%i == 0)
    {
    if(isPrime(i))
    {
    System.out.print(i+ " ");
    }
  }
}
}

static boolean isPrime(int x)
{
int i=2;
 while(i<=x/2)
 {
   if(x%i == 0)
   return false;
	i++;
 }
   return true;
}
}
