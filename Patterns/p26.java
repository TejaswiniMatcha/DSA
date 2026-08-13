import java.util.*;
import java.lang.*;
import java.io.*;

class p26
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int c=1;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=(2*n)-1;j++){
		        if(j%2==0)
		        System.out.print("* ");
		        else
		        System.out.print(c+" ");
		        c++;
		      
		    }
		    
		    System.out.println();
		    
		}
	}
}
/*	1 * 3 * 5 * 7 
	8 * 10 * 12 * 14 
	15 * 17 * 19 * 21 
	22 * 24 * 26 * 28  	*/
