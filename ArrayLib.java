
import java.util.Scanner;
public class ArrayLib 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to get 2D Integer Array ");
		System.out.println("Press 2 to get 2D double Array ");
		System.out.println("Press 3 to get 2D boolean Array ");
		int val=sc.nextInt();
		System.out.println("Enter the order of the matrix");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Enter "+r*c+" elements");
		

		switch(val)
		{  
	    case 1:{
	    int ar[][]=new int[r][c];
	    for(int i=0;i<ar.length;i++)
		{
		for(int j=0;j<ar[i].length;j++)
		{
		ar[i][j]=sc.nextInt();
		}
		}
	    for(int i=0;i<ar.length;i++)
		{
		for(int j=0;j<ar[i].length;j++)
		{
		System.out.print(ar[i][j]+" ");
		}
		System.out.println();
		}
	    break;  
           }
	    case 2:{
	    	double ar[][]=new double[r][c];
	  	    for(int i=0;i<ar.length;i++)
	  		{
	  		for(int j=0;j<ar[i].length;j++)
	  		{
	  		ar[i][j]=sc.nextDouble();
	  		}
	  		}
	  	    
	  	  for(int i=0;i<ar.length;i++)
			{
			for(int j=0;j<ar[i].length;j++)
			{
			System.out.print(ar[i][j]+" ");
			}
			System.out.println();
			}
	    	
	    break; 
} 
	    case 3:{
	    	boolean ar[][]=new boolean[r][c];
	  	    for(int i=0;i<ar.length;i++)
	  		{
	  		for(int j=0;j<ar[i].length;j++)
	  		{
	  		ar[i][j]=sc.nextBoolean();
	  		}
	  		}
	  	    
	  	  for(int i=0;i<ar.length;i++)
			{
			for(int j=0;j<ar[i].length;j++)
			{
			System.out.print(ar[i][j]+" ");
			}
			System.out.println();
			}
	    break;  
	}	
	    default:System.out.println("Entere valid option");
		}

	}
	}






