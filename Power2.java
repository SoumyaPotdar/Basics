
public class Power2
{
public static void main(String[] args) 
{
int N=Integer.parseInt(args[0]);
if(N>=0&&N<31)
{
for(int i=0;i<=N;i++)
{

int res=power(2,i);
System.out.println("2^"+i +" = "+res);
}
}
else
System.out.println("overflow..Enter N value less than 31");
}

static int power(int n,int p)
{
int r=1;
while(p>0)
{
r=n*r;
p--;
}
return r;
}
}



