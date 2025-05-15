package Spacial50;

public class test15 {

	public static void main(String[] args) {
		String s="RaMana";
		String result="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				result+=(char)(ch-32);
			}
			else if(ch>='A'&&ch<='Z')
			{
				result+=(char)(ch+32);
			}
			else
			{
				result+=ch;
			}
				
		}
		System.out.println(result);

	}

}
