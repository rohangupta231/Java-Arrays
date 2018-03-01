class MergeSort
{
	public static int[] merge(int l[],int r[],int a[])
	{
		int i=0,j=0,k=0;
		while((i<l.length)&&(j<r.length))
		{
			if(l[i]<=r[j])
			{
				a[k]=l[i];
				i++;
			}
			else
			{
				a[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<l.length)
		{
			a[k]=l[i];
			i++;
			k++;
		}
		while(j<r.length)
		{
			a[k]=r[j];
			j++;
			k++;
		}
		return a;
	}
	public static int[] mergeSort(int a[])
	{
		if(a.length<2)
		{
			return a;
		}
		int mid=a.length/2;
		int l[]=new int[mid];
		int r[]=new int[a.length-mid];
		for(int i=0;i<l.length;i++)
		{
			l[i]=a[i];
		}
		for(int j=mid;j<a.length;j++)
		{
			r[j-mid]=a[j];
		}
		l=mergeSort(l);
		r=mergeSort(r);
		a=merge(l,r,a);
		return a;
	}
	public static void main(String dt[])
	{
		int a[]={5,15,1,8,7,8};
		int i;
		int b[]=mergeSort(a);
		for(i=0;i<b.length;i++)
		{
			System.out.print(" "+b[i]);
		}
	}
}