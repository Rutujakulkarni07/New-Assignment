class sample{
	public static void main(String args[])throws java.io.IOException
	{
	char ch;
	int a=100,b=300,c;
	System.out.println("Enter ur choice/n");
	System.out.println("a:add/nb:sub/nc:mul/nd:div");
		ch=(char)System.in.read();
		switch(ch)
		{
			case 'a':
				c=a+b;
				System.out.println("addition="+c);
				break;
			case 'b':
				c=a-b;
				System.out.println("subtraction="+c);
				break;
			case 'c':
				c=a*b;
				System.out.println("multipication="+c);
				break;
			case 'd':
				c=a/b;
				System.out.println("division="+c);
				break;
			default:System.out.println("Invaild Input");
		}
	}
}