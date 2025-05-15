package Arrays2;

public class SecondElement2 {

	public static void main(String[] args) {
		int []a= {4,3,7,10,11,5,6,9};
		
		int min=Integer.MAX_VALUE;
		int sm=Integer.MAX_VALUE;
		for(int n:a)
		{
			if(min<n)
			{
				sm=min;
				min=n;
			}
			else if(n<sm &&n!=min)
			{
				sm=n;
			}
		}
		System.out.println(sm);

	}

}
