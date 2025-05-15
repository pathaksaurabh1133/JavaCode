package Arrays2;

public class smallestelement {

	public static void main(String[] args) {
		int [] a= {5,8,2,4,1,3};
		int  s=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<s)
			{
				s=a[i];
			}
		}
		System.out.println("smallest element="+s);
		

	}

}
