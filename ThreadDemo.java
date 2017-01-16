// create a new thread.
class NewThread implements Runnable
{
	Thread t;
	NewThread(){
//create a new second thread 
	t=new Thread(this,"Demo Thread");
	System.out.println("child Therad"+t);
	t.start();
}
//this is the entry point for the second thread.
public void run(){
	try{
		for(int i=5;i>0;i--){
		System.out.println("child Thread" +i);
//let the thread sleep for while
		Thread.sleep(500);
		}
}catch(InterruptedException e){
	System.out.println("child interupted");
	}
	System.out.println("exiting child thread");
	}
      }
public class ThreadDemo{
	public static void main(String args[]){
		new Thread();//create a new thread
		try{
			for(int i=5;i>0;i--){
			System.out.println("main Thread"+i);
			Thread.sleep(1000);
		    }
	}
	
	catch(InterruptedException e){
	System.out.println("main Thread interupted");
}
}
 	//System.out.println("Main Thread exiting");

}
	
		