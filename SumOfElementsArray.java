class SumOfElementsArray
{
	public static void main(String dt[])
	{
		//int a[]=new int[6];
		int sum=0,i=0;
		int a[]={5,11,9,25,5};
		for(i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.print("="+sum);
	}
}