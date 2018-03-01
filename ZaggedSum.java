class ZaggedSum
{
	public static void main(String dt[])
	{
		int a[][]={{2,1,1},{1},{1,1,6}};
		int c[]=new int[3];
		int i=0,j=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		for(i=0;i<a.length;i++)
		{	
			for(j=0;j<a[i].length;j++)
			{
				c[j]=c[j]+a[i][j];
			}
		}
		System.out.print("\n");
		for(i=0;i<c.length;i++)
		{
				System.out.print(c[i]+" ");
		}
	}
}
