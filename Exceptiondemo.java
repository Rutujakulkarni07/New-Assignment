class rutuja extends Exception
{
	private String name;
	rutuja(String a)
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
      
	static void compute(String a) throws rutuja
	{
		        System.out.println("called compute("+ a +")");
			if(a!="rutuja")
		 	   throw new rutuja(a);
			System.out.println("normal Exit");
	}
		public static void main(String args[])
		{
			try
		        {
			compute("rutuja");
			compute("sujay");
			}
			catch(rutuja e)
			{
			System.out.println("cought" +e);
			}
		}
}