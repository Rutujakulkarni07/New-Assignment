class rutuja extends Exception
{
	private string name;
	rutuja(String a);
	{
		name=a;
	}
	public String toString()
	{
			return "rutuja["+name+"]";
	}
}
class Exceptiondemo
{
	static void compute(String a)throws rutuja
	{
		System.out.println("called compute("+ a +")");
		if(a!="rutuja")
		throws new rutuja(a);
		System.out.println("normal Exit");
		public static void main("String args[]")
		{
			try
		}
		compute(vikas);
		compute(sujay);
	}
	catch(rutuja e)
	{
	System.out.println("cought" +e);
	}
}