class grade
{
	public static void main(String args[])
	{
		
	int per;
	String grade;
	System.out.println("Enter the percentage");
	per=Integer.parseInt(System.console().readLine());

	if (per>=70)
	  grade="Dist";
	
	else if(per<70 && per>=60)
	  grade="1st class";
	
	else if(per<60 && per>=50)
	  grade="2nd class";
	
	else if(per<50 && per>=40)
	  grade="3rd class";
	
	else
	  grade="fail";
	System.out.println("grade="+grade);
}

}