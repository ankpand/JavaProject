package Practice;

public class myyclass {
	public static int amount = 0;

	public static void main(String[] args) {
		myyclass thread = new myyclass();
	    thread.start();
	    System.out.println(amount);
	    amount++;
	    System.out.println(amount);
	  }

	 

	private void start() {
		// TODO Auto-generated method stub
		
	}



	public void run() {
	   amount++;
	  }
	

		// TODO Auto-generated method stub

	}


