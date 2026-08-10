import java.util.*;
import java.lang.*;
import java.io.*;

class p4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=n;i>=0;i--){
		    for(int j=1;j<=i;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}

	}
}
/*  * * * * * 
    * * * * 
    * * * 
    * * 
    * 		*/