
import java.util.Scanner;

public class InsertionSort 
{
   public static void main(String[] args)
   {
          System.out.println("Enter the size of array");
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          System.out.println("Enter the elements of array");
          int[] a=new int[n];
	 for(int i=0;i<a.length;i++)
         {
	   a[i]=sc.nextInt();
         }
	  
           System.out.println("Entered  elements are");	   
	  for(int i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]);
	   } 
          int[] r=insertion(a);
          
           System.out.println("Sorted elements are");	   
          for(int i=0;i<r.length;i++)
	   {
		   System.out.println(r[i]);
	   }  
          
     }
     
     static int[] insertion(int[] a)
     {
         for(int i=1;i<a.length;i++)
         {
            int t=a[i];
             int j=i;
             for(;j>0;j--)
            {
            if(t<a[j-1])
             {
                a[j]=a[j-1];
             }
           else
             break;
            }
              a[j]=t;
         }
         return a;
      }

}

