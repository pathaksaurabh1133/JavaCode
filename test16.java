package Spacial50;

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		String s="india that is bharat";
		
		Scanner scn=new Scanner(s);
		scn.useDelimiter(" ");
		String result="";
		while(scn.hasNext())
		{
			String word=scn.next();
			String word2=word.substring(0, 1).toUpperCase()+word.substring(1);
			result+=word2+" ";
		}
		System.out.println(result);

	}

}
