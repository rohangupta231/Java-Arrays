class InsertionSort
{
	public static void main(String dt[])
	{
		int i=0,value=0,hole=0;
		int a[]={5,15,1,8,7};
		for(i=1;i<a.length;i++)
		{
			value=a[i];
			hole=i;
			while((hole>0)&&(a[hole-1]>value))
			{
				a[hole]=a[hole-1];
				hole--;
			}
			a[hole]=value;
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}