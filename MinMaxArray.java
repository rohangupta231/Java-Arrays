class MinMaxArray
{
	public static void main(String dt[])
	{
		//int a[]=new int[6];
		int i=0;
		int a[]={5,1,1,8,21,1};
		for(i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		int min=a[0],max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.print("\nMax vaue is ="+max+"\nMin value is"+min);
	}	
}