package Spacial50;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		String s1="madam";
		String s2=reverse(s1);
		
		if(s1.equals(s2)) System.out.println("pallimdrone");
		else System.out.println("not pallimdrone");
		
		
		
	}
	public static String reverse(String s1)
	{
		Scanner scn=new Scanner(s1);
		scn.useDelimiter("");
		String s2="";
		while(scn.hasNext())
		{
			s2=scn.next()+s2;
		}
		return new String(s2);
	}

}
