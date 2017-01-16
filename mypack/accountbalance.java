//package example
package mypack;	
class balance
{
	String name;
	double bal;
	balance(String n,double b)
	{
		name=n;
		bal=b;
	}
	void show()
	{
		if(bal<0)
		System.out.println("--> ");
		System.out.println(name+" "+"Rs."+" "+bal);
	}
}
class accountbalance
{
	public static void main(String args[])
	{
		balance current[]=new balance[3];
		current[0]=new balance("abc",123.23);
		current[1]=new balance("vsk",157.01);
		current[2]=new balance("tom jackson",-12.33);
		for(int i=0;i<3;i++) current[i].show();
	}
}	