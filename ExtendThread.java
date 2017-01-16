//create a second thread by extending Thread
 class NewThread extends Thread
{
	NewThread()
	{
	//create a new, second Thread
		super("Demo Thread");
		System.out.println("Child thread:"+this);
		start();//start the thread
	}
	//this is the entry point of second thread
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("child thread:"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("child interrupted");
		}
		System.out.println("Exiting child thread:");
	}
}
class ExtendThread
{
	public static void main(String args[])
	{
		new NewThread();//create a new thread
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Main Thread:"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread interrupted");
		}
		System.out.println("MainThread exiting");
	}
}
		