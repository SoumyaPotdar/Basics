import java.util.Scanner;
class Message
{
public static void main(String[] args)
{

System.out.println("Enter the username");
Scanner sc=new Scanner(System.in);
String usrname=sc.next();
char ch[]=usrname.toCharArray();

if (ch.length<3)
{
System.out.println("Invalid username");
}
else
{
System.out.println("Hello "+usrname+ " How are you..?");
}

}
}

