package Arrays2;

public class LinearSearch {

	public static void main(String[] args) {
		int []a= {1,4,8,2,9,3,1};
		System.out.println(search(a,9));
		System.out.println(search(a,10));

	}
	public static int search(int []a,int e)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==e) return i;
		}
		return -1;
	}

}
