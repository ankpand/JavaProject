package Practice;

public class runable implements Runnable {

	public static void main(String[] args) {
          runable obj= new runable();
          Thread objj=new Thread(obj);
		
		  obj.start();
		  System.out.println("thread is working");
	}

	private void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
