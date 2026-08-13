import java.util.*;
import java.lang.*;
import java.io.*;

class p25
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
		        else{
		        System.out.print(c+" ");
		        c++;
		      }
		    }
		    
		    System.out.println();
		    
		}
	}
}
/*	1 * 2 * 3 * 4 
	5 * 6 * 7 * 8 
	9 * 10 * 11 * 12 
	13 * 14 * 15 * 16	*/
