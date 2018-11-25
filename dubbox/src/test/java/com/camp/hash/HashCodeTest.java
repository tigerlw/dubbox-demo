package com.camp.hash;

public class HashCodeTest 
{
	public static void main(String args[])
	{
		String name = "liuwei";
		
		System.out.println(name.hashCode());
		System.out.println(name.hashCode()^ (name.hashCode() >>> 16));
	}

}
