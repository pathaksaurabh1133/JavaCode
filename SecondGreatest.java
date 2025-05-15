package Arrays2;

public class SecondGreatest {

	public static void main(String[] args) {
		int []a= {4,3,7,10,11,5,6,9};
		int  g=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>g)
			{
				g=a[i];
			}
		}
		System.out.println("Greatest Element="+g);

	}

}
