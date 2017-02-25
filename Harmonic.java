
public class Harmonic
{
public static void main(String[] args) 
{
int N=Integer.parseInt(args[0]);
float sum=0;

for(int i=1;i<=N;i++)
{
System.out.print("1/"+i+"+ ");
sum=sum+(float)1/i;
}

System.out.println("="+sum);
}
}
