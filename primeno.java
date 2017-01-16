class primeno{
	public static void main(String args[]){
		int a,i;
		boolean flag=false;
		System.out.println("Enter the value of a");
		a=Integer.parseInt(System.console().readLine());
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
			   System.out.println("NO is not prime");
				//flag=false;
			   break;
			}
			else
			{
			   flag=true;
			}
		}
		if(flag==true)
		  System.out.println("No is prime");
	}
}
	