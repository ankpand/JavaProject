package Practice;

public class threaad extends Thread
{
  
  
	public static void main(String[] args) 
	{
	  threaad obj= new threaad();
	  obj.start();
	  System.out.println("thread is working");
	  
	

	}
	public void run()
	{
		System.out.println("thread is running");
	}

}
