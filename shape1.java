class circle
{
	double rad;
	double a;
	circle(){}
	circle(double r)
	{
		rad=r;
	}
	double area()
	{
		double pi=3.1416;
		a=pi*rad*rad;
		return a;
	}
}
class shape1
{
	public static void main(String args[])
	{
		double result;
		circle c=new circle();
		circle c1=new circle(10.5);
		result=c1.area();
		System.out.println("Area of circle="+result);
	}
}