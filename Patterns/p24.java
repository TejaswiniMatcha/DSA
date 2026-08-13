import java.util.*;
import java.lang.*;
import java.io.*;

class p24
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++)
		    System.out.print(j+" ");
		    System.out.println();
		    
		}
		for(int i=n-1;i>=1;i--){
		    for(int j=1;j<=i;j++)
		    System.out.print(j+" ");
		    System.out.println();
		}
	}
}
/*	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 
	1 2 
	1 		*/
