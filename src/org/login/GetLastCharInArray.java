package org.login;

public class GetLastCharInArray 
{


	    public static void main(String args[])
	    
	    {
	    
	    String words[]={"sunday","moday","Tuesday","Jan","Feb","March"};
	    String temp="";
	    char last_char;
	    String y="";
	    int n;
	    
	    for(int i=0;i<6;i++)
	       {
	           temp=words[i];
	           System.out.println(temp);
	           n=temp.length();
	           last_char=temp.charAt(n-1);
	           y=y+last_char;
	           
	          
	       }
	    
	    
	      System.out.println(y);
	    }
	
}
