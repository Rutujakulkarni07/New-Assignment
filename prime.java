class prime
{
	public static void main(String args[])throws java.io.IOException
	{
	 int i,j;
	 boolean flag=true;
	 for (i=1;i<=100;i++)
		{
		 for(j=2;j<i;j++)
			{
			 if(i%j==0)
				{
				 flag=true;
				 break;
				}
				else
				{
				 flag=false;
				}
			}
			if(flag==false)
			{
			 System.out.print(i+" ");
			}
			
		}
	}
}
		
