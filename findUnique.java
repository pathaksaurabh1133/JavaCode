package Arrays2;

public class findUnique {

	public static void main(String[] args) {
		int []a= {1,2,1,5,5};
		 
		System.out.println(uniquenumber(a));

	}
	public static int uniquenumber(int []a)
	{
		int [] newarr=new int[a.length];
		for(int n:a)
		{
			newarr[n]++;
		}
		for(int i=0;i<newarr.length;i++)
		{
			
		}
	}

}
