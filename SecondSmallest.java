package Arrays2;

public class SecondSmallest {

	public static void main(String[] args) {
		int []a= {4,3,7,10,11,5,6,9};
		int max=Integer.MIN_VALUE;
		int sm=Integer.MIN_VALUE;
		for(int num:a)
		{
			if(num>max)
			{
				sm=max;
				max=num;
			}
			else if(num>sm &&num!=max)
			{
				sm=num;
			}
		}
		System.out.println("Second Smallest="+sm);

	}

}
