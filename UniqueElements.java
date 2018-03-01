class UniqueElements
{
	public static void main(String dt[])
	{	
		//int a[]=new int[6];
		int num=9,i=0,count=0,j=0,flag=0;
		int a[]={5,11,25,5,9,3};
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0;i<a.length;i++)
		{
			count=0;
			flag=0;
			for(j=0;j<a.length;j++)
			{
				/*if(a[i]==a[j])
				{
					count++;					
				}*/
				if((i>j)&&(a[i]==a[j]))
				{
					flag=1;
				}
			}
			if(flag==0)
			{
			System.out.print("\n"+a[i]);
			}
		}	
	}
}