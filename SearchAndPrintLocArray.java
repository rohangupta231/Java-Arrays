class SearchAndPrintLocArray
{
	public static void main(String dt[])
	{	
		//int a[]=new int[6];
		int num=9,i=0,count=0;
		int a[]={5,11,9,25,5,9};
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.print("\nIts Location is"+(i+1));
			}
			else
			{
				count=1;
			}
		}
		if(count==0)
		{
			System.out.print("Element Not Found");
		}
	}
}