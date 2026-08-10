import java.util.*;
import java.lang.*;
import java.io.*;

class p7
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int space=0;
		for(int i=n;i>=1;i--){
		    space=n-i;
		    for(int j=i;j>=space;j--){
		        System.out.print(" ");
		        System.out.print("* ");
		    }
		    System.out.println();
		}

	}
}

/*  	*  *  *  *  *  * 
 	*  *  *  * 
 	*  *                  */