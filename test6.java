package Spacial50;

public class test6 {

	public static void main(String[] args) {
		String s1="ash123";
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				int index=ch-'0';
				sum+=index;
			}
		}
		System.out.println(sum);

	}

}
