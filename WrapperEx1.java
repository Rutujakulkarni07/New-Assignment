public class WrapperEx1
{
	public static void main(String args[])
	{
	   //converting int into Integer
		int a=20;
		Integer i=Integer.valueOf(a);//converting int into Integer
		Integer j=a;			//unboxing
		System.out.println(a+" "+i+" "+j);
	}
}