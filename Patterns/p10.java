import java.util.*;
import java.lang.*;
import java.io.*;

class p10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n-i;j++)
		        System.out.print(" ");
		    for(int j=1;j<=i;j++)
		    System.out.print("* ");
		  System.out.println();
		}
		for(int i=n;i>=1;i--){
		    
		    for(int j=n;j>=i;j--)
		    System.out.print(" ");
		    for(int j=1;j<=i-1;j++)
		        System.out.print("* ");
		    System.out.println();
		}

	}
}

/*	 * 
   	* * 
       * * * 
      * * * * 
     * * * * * 
      * * * * 
       * * * 
        * * 
         *    		*/

ANOTHER CODE:

import java.util.*;
import java.lang.*;
import java.io.*;

class p10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n-i;j++)
		        System.out.print(" ");
		    for(int j=1;j<=i;j++)
		    System.out.print("* ");
		  System.out.println();
		}
		for(int i=n;i>=1;i--){
		    
		    for(int j=1;j<=n-i+1;j++)
		    System.out.print(" ");
		    for(int j=1;j<=i-1;j++)
		        System.out.print("* ");
		    System.out.println();
		}

	}
}