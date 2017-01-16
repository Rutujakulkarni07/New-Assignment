abstract class area
{
	int dim1;
	int dim2;
	abstract int area();
	area(int a, int b)
	{
		dim1=a;
		dim2=b;
	}
}
class rectangle extends area{
rectangle(int p,int q)
	{
		super(p,q);
	}
	int area()
	{
		return dim1*dim2;
	}
}
class traingle extends area
{
	traingle(int x,int y)
	{	
		super(x,y);
	}
	int area()
	{
		return dim1*dim2/2;
	}
}
class abstractdemo
{
	public static void main(String args[])
	{
		rectangle r = new rectangle(10,20);
		traingle t = new traingle(8,10);
		area a;
		a=r;
		System.out.println("p*q="+a.area());
		a=t;
		System.out.println("x*y/2="+a.area());
	}
}
		