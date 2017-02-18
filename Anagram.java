
import java.util.Scanner;
public class Anagram
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
Anobj an=new Anobj();
System.out.println("Enter the  first string");
String st1=sc.nextLine();

System.out.println("Enter the second string");

String st2=sc.nextLine();
boolean rs=an.isAnagram(st1,st2);
if(rs)
{
System.out.println("The  two strings are Anagram");
}
else
{
System.out.println("The  two strings are not  Anagram");
}
}
}

class Anobj
{
boolean isAnagram(String s1,String s2)
{
s1=removeSpace(s1);
s2=removeSpace(s2);
if(s1.length()!=s2.length())
return false;
s1=toLower(s1);
s2=toLower(s2);
boolean b=check(s1,s2);
return b;
}

String removeSpace(String st)
{
char ch[]=st.toCharArray();
st="";
for(int i=0;i<ch.length;i++)
{
if(ch[i]!=' ')
{
st=st+ch[i];
}
}
return st;
}

String toLower(String st)
{
char ch[]=st.toCharArray();
st="";
for(int i=0;i<ch.length;i++)
{
if(ch[i]>=65 &&ch[i]<=90)
{
ch[i]=(char)(ch[i]+32);
}
}
st=new String(ch);
return st;
}

boolean check(String st1,String st2)
{
char c1[]=st1.toCharArray();
char c2[]=st2.toCharArray();
c1=sort(c1);
c2=sort(c2);
for( int i=0;i<c1.length;i++)
{
if(c1[i]!=c2[i])
return false;
}
return true;
}

char[] sort(char ch[])
{
for(int i=0;i<ch.length-1;i++)
{
for(int j=i+1;j<ch.length;j++)
{
if(ch[i]>ch[j])
{
char t=ch[i];
ch[i]=ch[j];
ch[j]=t;
}
}
}
return ch;
}
}


				                
