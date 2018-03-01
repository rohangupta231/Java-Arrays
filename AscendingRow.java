class AscendingRow
{
	public static void main(String dt[])
	{
		int a[][]={{3,2,1},{7,4,5},{9,4,3}};
		int c[][]=new int[3][3];
		int i=0,j=0,k=0,swap=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				for(k=0;k<a[i].length-1-j;k++)
				{
					if(a[i][k]>a[i][k+1])
					{
						swap=a[i][k];
						a[i][k]=a[i][k+1];
						a[i][k+1]=swap;
					}
				}
			}
		}
		System.out.print("\n");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
