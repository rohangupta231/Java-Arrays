class ReverseArrayP
{
	public static void main(String dt[])
	{	
		//int a[]=new int[6];
		int num=9,i=0,count=0,swap=0;
		int a[]={5,11,9,25,5,9};
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0;i<a.length/2;i++)
		{
			swap=a[i];
			a[i]=a[a.length-1-i];	
			a[a.length-1-i]=swap;	
		}
		System.out.print("\n");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
			
	}
}