import java.util.*;
import java.lang.*;
import java.io.*;

class p28
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=n;i>=1;i--){
		    char c='A';
		    for(int j=1;j<=n-i;j++)
		        System.out.print(" ");
		    for(int j=1;j<=i;j++){
		        System.out.print((char)c+" ");
		      c+=1;  
		    }
		    System.out.println();
		    
		}
	}
}


/*	A B C D E F G 
 	 A B C D E F
  	  A B C D E 
   	   A B C D 
    	    A B C 
     	     A B
      	      A			*/