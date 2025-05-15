package Arrays2;

public class bubbleSort {

	public static void main(String[] args) {
		int []a= {4,3,7,10,11,5,6,9};
		sort(a);
		for(int n:a) System.out.print(n+" ");

	}
	public static void sort(int []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
