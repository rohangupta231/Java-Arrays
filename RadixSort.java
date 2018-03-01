class RadixSort
{
	public static int big(int arr[],int size)
	{	
		int temp=arr[0];
		for(int i=1;i<size;i++)
		{
			if(arr[i]>temp)
			{
				temp=arr[i];
			}
		}
		/*while(temp>0)
		{
			length=length+1;
			temp=temp/10;
		}*/
		return temp;
	}
	public static void countSort(int arr[],int size,int exp)
	{
		int count[]=new int[10];
		int i=0,lsd=0,index=0;
		int result[]=new int[size];
		for(i=0;i<size;i++)
		{
			/*lsd=(arr[i]/exp)%10;
			count[lsd]=count[lsd]++;*/
			count[(arr[i]/exp)%10]++;
		}
		for(i=1;i<10;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		for(i=size-1;i>=0;i--)
		{
			/*lsd=(arr[i]/exp)%10;
			index=count[lsd]-1;
			result[index]=arr[i];*/
			result[count[(arr[i]/exp)%10]-1]=arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for(i=0;i<size;i++)
		{
			arr[i]=result[i];
		}
	}
	public static void radixSort(int arr[],int size)
	{
		int m=big(arr,size);
		for(int exp=1;m/exp>0;exp*=10)
		{
			countSort(arr,size,exp);
		}
	}
	public static void main(String dt[])
	{
		int arr[]={100,54,355,102,43,10,287,5};
		int radix=arr.length;
		radixSort(arr,radix);
		for(int i=0;i<radix;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}