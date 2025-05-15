package Arrays2;

import java.util.Arrays;

public class immediateSmaller {

	public static void main(String[] args) {
	int arr[] = {4, 2, 1, 5, 3};
	
	int newarr[]=new int[arr.length];
	int j=0;
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]>arr[i+1])
		{
			newarr[j++]=arr[i+1];
		}
		else
		{
			newarr[j++]=-1;
		}
	}
	newarr[j]=-1;
	System.out.println(Arrays.toString(newarr));

	}

}
