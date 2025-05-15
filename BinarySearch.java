package Arrays2;

public class BinarySearch {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		System.out.println(search(a,10));
        System.out.println(search(a,5));
	}
	public static int search(int []a,int e)
	{
		int first=0,last=a.length-1;
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(a[mid]==e) return mid;
			else if(a[mid]>e) last=mid-1;
	    	else   first=mid+1;
	
		}
		return -1;
	}

}
