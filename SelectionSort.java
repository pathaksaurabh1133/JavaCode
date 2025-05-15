package Arrays2;

public class SelectionSort {

	public static void main(String[] args) {
		int []a= {4,3,7,10,11,5,6,9};
		sort(a);
		for(int n:a) System.out.print(n+" ");
	}
	public static void sort(int []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=index+1;j<a.length;j++)
			{
				if(a[j]<a[index]) index=j;
			}
			if(i!=index)
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}

	}

}
