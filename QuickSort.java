class QuickSort
{
	public static int partition(int a[],int start,int end)
	{
		int pivot=a[end];
		int pindex=start;
		int swap;
		for(int i=start;i<end;i++)
		{
			if(a[i]<=pivot)
			{
				swap=a[i];
				a[i]=a[pindex];
				a[pindex]=swap;
				pindex++;
			}
		}
		swap=a[pindex];
		a[pindex]=a[end];
		a[end]=swap;
		return pindex;
	}
	public static void quickSort(int a[],int start,int end)
	{
		if(start<end)
		{
			int pindex=partition(a,start,end);
			quickSort(a,start,pindex-1);
			quickSort(a,pindex+1,end);
			
		}	
	}
	public static void main(String dt[])
	{
		int a[]={7,8,534,24,55,2,5,1};
		quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
} 