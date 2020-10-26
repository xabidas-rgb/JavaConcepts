package threadCreation;

/**
 * @author abinash
 * A demo program to show, how to create a Java Thread implementing Runnable interface
 */
public class MTDemoByImplementingRunnable implements Runnable {
	
	@Override
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getName() +
					           " is running.");
		}catch(Exception e) {
			System.out.println("Exception occured!!");
		}		           
	}
	
	public static void main(String[] args) {
		int counter = 10;
		for(int i=0;i<counter;i++) {
			Thread thread = new Thread(new MTDemoByImplementingRunnable());
			thread.start();
		}
	}

}
