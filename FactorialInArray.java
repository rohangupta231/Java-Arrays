class FactorialInArray
{
	public static void main(String dt[])
	{
		int a[]=new int[100];
		int i=0,num=50,temp=0,fact=1,count=1;
		while(count<num)
		{
			fact=fact*count;
			count++;
			temp=fact;
			i=0;
			while(temp>0)
			{
			a[i]=temp%10;
			temp=temp/10;
			i++;
			}
		}
		for(i=a.length-1;i>=0;i--)
		{
			System.out.print(i);
		}		
	}
}