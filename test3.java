package Spacial50;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		String s1="javadeveloper";
		int count=0;
		Scanner scn =new Scanner(s1);
		scn.useDelimiter("");
		while(scn.hasNext())
		{
			scn.next();
			count++;
		}
		System.out.println(count);

	}

}
