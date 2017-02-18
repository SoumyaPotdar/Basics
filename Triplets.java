
import java.util.Scanner;
public class Triplets
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();
int[] a=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}

for(int i=0;i<a.length-2;i++)
{
for(int j=0;j<a.length-1;j++)
{
for(int k=0;k<a.length;k++)
{
if((a[i]+a[j]+a[k])==0)
{
System.out.println("Sum of three Integer adds to ZERO are "+ a[i]+" " +a[j]+" "+ a[k]);
}
}
}
}
}
}

