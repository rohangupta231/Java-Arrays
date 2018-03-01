class SelectionSort
{
	public static void main(String dt[])
	{
		int i=0,j=0,min=0,swap=0,a[]={5,11,9,25,5};
		for(i=0;i<a.length;i++)
		{	
			System.out.print(a[i]+" ");	
		}
		for(i=0;i<a.length;i++)
		{
			min=i;
			for(j=i;j<a.length;j++)
			if(a[j]<a[min])
			{
				min=j;
			}
			swap=a[i];	
			a[i]=a[min];
			a[min]=swap;
		}
		System.out.print("\n");
		for(i=0;i<a.length;i++)
		{	
			System.out.print(a[i]+" ");	
		}
	}
}