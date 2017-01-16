class circle
{
	double rad;
	double a;
	double area()
	{
		double pi=3.1416;
		a=pi*rad*rad;
		return a;
	}
	void get_redius(double r)
	{
		rad=r;
	}
}
class rectangle
{
	double height,width;
	void get_data(double h,double w)
	{
		height=h;
		width=w;
	}
	double area()
	{
		return height*width;
	}
}
class shape
{
	public static void main(String args[])
	{
		double result;
		circle c=new circle();
		c.get_redius(3.25);
		result=c.area();
		System.out.println("Area of circle="+result);
		double result2;
		rectangle r=new rectangle();
		r.get_data(30.2,47.9);
		result2=r.area();
		System.out.println("Area of rectangle="+result2);
	}
}
