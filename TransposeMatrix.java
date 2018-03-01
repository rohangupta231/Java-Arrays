class TransposeMatrix
{
	public static void main(String dt[])
	{
		int i=0,j=0,a[][]={{1,1,1},{1,1,1},{1,1,1}};
		int b[][]= new int[3][3];
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
				b[j][i]=a[i][j];
			}
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
		
		
	}
}