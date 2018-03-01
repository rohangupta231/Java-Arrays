class AddTwoMatrice
{
	public static void main(String dt[])
	{
		int a[][]={{1,2,3},{4,5,7},{9,4,3}},b[][]={{1,2,3},{4,5,7},{9,4,3}};
		int c[][]=new int[3][3];
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
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.print("\n");
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
