import java.util.*;
import java.lang.*;
import java.io.*;

class p3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int space=0;
		for(int i=1;i<=n;i++){
		    space=n-i;
		    for(int j=1;j<=space;j++)
		    	System.out.print(" ");
		    for(int j=1;j<=i;j++)
		        System.out.print("* ");
		    
		    System.out.println();
		}

	}
}
/*   * 
    * * 
   * * * 
  * * * * 
 * * * * *   */
