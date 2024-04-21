package org.login;

import java.util.HashMap;
import java.util.Map;

public class CaracterOccurances {

	public static void main(String[] args)
	{
	
		String s1="automation";
		char[] arr=s1.toCharArray();
		HashMap<Character,Integer> count=new HashMap<Character,Integer>();
		
		for(char c : arr)
		{
			
			if(count.containsKey(c))
					{
				count.put(c, count.get(c)+1);
				}
			else
			{
				count.put(c, 1);
			}
			
			
		}
		
		for(Map.Entry entry: count.entrySet())
		{
		
		System.out.println(entry.getKey()+"     Character Occurs "+entry.getValue());
		}
		
		}

}
