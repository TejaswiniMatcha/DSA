import java.util.*;
import java.lang.*;
import java.io.*;

class p15
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=n;i>=1;i--){
		    
		    for(int j=1;j<=n-i;j++)
		    System.out.print(" ");
		    for(int j=1;j<=i;j++)
		        System.out.print("* ");
		    System.out.println();
		}

	}
}

/*	* * * * * 
 	 * * * * 
  	  * * * 
   	   * * 
            *   	*/