package Spacial50;

public class test11 {

	public static void main(String[] args) {
		String s1="ramana";
		char [] arr=s1.toCharArray();
		int countarr[]=new int[26];
		for(char ch:arr)
		{
			int index=ch-'a';
			countarr[index]++;
		}
		int maximum=0;
		char ch='a';
		for(int i=0;i<26;i++)
		{
			if(countarr[i]>maximum)
			{
				maximum=countarr[i];
				ch=(char)(i+'a');
			}
		}
		System.out.println(ch);
		

	}

}
