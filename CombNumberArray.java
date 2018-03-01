class CombNumberArray
{
	public static void main(String dt[])
	{
		int arr[]=new int[3];
		int num=123,count=0,i=0,j=0,digit=0,temp1=num,temp2=num;
		while(temp1>0)
		{
			temp1=temp1/10;
			count++;
		}
		for(j=0;j<count;j++)
		{
			digit=temp2%10;
			temp2=temp2/10;		
			for(i=0;i<count-1;i++)
			{
				digit=digit*10;	
			}
			temp2=temp2+digit;
			a[j]=temp2;
		}
	}
}