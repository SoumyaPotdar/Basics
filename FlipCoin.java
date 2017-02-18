import java.util.Scanner;
class FlipCoin
{
public static void main(String[] args)
{

System.out.println("Enter how many times to flip");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double head=0.0;
double tail=0.0;

for(int i=1;i<=n;i++)
{
double d=Math.random();
if(d<0.5)
{
tail++;
}
else 
{
head++;
}
}


System.out.println("Percentage of getting head is "+ (head/n)*100);
System.out.println("Percentage of getting head is "+ (tail/n)*100);
}
}

