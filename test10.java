package Spacial50;

public class test10 {

	public static void main(String[] args) {
	  String s="javadeveloper";
	  String vowels="";
	  for(int i=0;i<s.length();i++)
	  {
		  char ch=s.charAt(i);
		  if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
		  {
			  vowels+=ch;
		  }
	  }
	  System.out.println(vowels);

	}

}
