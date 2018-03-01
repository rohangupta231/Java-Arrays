class BubbleSort
{
	public static void main(String dt[])
	{
		int i=0,j=0,a[]={5,11,9,25,5},swap=0;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
			}
		}	
		System.out.print("\n");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}