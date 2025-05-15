package Spacial50;

public class test2 {

	public static void main(String[] args) {
		String s="ram#123";
		String s1="";
		String s2="";
		String s3="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'||ch<='z')
			{
				s1=s1+ch;
				
			}
			else if(ch>='0'&&ch<='9')
			{
				s2=s2+ch;
				
			}
			else {
				s3=s3+ch;
		}
		
		}
		System.out.println(s2+s3+s1);
		

	}

}
