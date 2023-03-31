package com.xworkz.AshaMamAssigned.MamGaven;

public class StringSpaceRemove {

	public static void main(String[] args) {
		
		String str ="i am sharath";
	
		String s[]=str.split(" ");
		String name=" ";
		
		for(int i=0;i<s.length;i++)
		{
			name=name+s[i];
			
		
		}
		System.out.println(name);
		
		
		
	}
	}