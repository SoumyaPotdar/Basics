import java.util.Scanner;
public class Gambler
{
static double win=0;
static double loss=0;
static double trail;
static double stack;
static double goal;

public static void main(String[] args) 
{

System.out.println("Enter the Stack value you have");
Scanner sc=new Scanner(System.in);
stack=sc.nextInt();

System.out.println("Enter the goal to be reached");
goal=sc.nextInt();

System.out.println("Enter the no of trails");
trail=sc.nextInt();


if(trail>0&&stack>0 && stack<=goal)
{
play(trail);
}
}

static void play(double n)
{
	for(int i=1;i<=n;i++)
	{
	double d=Math.random();
	if(d<0.5)
	{
	loss++ ;
	stack--;
	}
	else
	{
	win++;
	stack++;
	}
	}

System.out.println("Percentage of winning "+ (win/trail)*100+"%");
System.out.println("Percentage of loosing "+ (loss/trail)*100+"%");

}


}

