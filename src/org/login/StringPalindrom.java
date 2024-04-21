package org.login;

public class StringPalindrom 
{
public static void main(String[] args)
{
String original="Automation";
String reverse="";
for(int i=original.length()-1;i>=0;i--)
{
	reverse=reverse+original.charAt(i);
}

System.out.println(reverse);
if(original.equalsIgnoreCase(reverse))
{
	System.out.println("Palindrom");
}

	

}

}
