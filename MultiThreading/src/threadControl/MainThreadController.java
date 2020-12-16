package threadControl;

/**
 * @author abinash
 * This program demonstrates on how to control the main thread execution
 */
public class MainThreadController extends Thread {
	
	public static void main(String[] args) {
		
		// Getting reference to the main thread
		Thread t = Thread.currentThread();
		
		// Getting the name of main thread
		System.out.println("Current Thread : " + t.getName());
		
		// Changing the name of main thread
		t.setName("Abinash");
		System.out.println("After name change : " + t.getName());
		
		// Getting the priority of main thread
		System.out.println("Main thread priority : " + t.getPriority());
		
		// Changing the priority of main thread to MAX(10)
		t.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Main thread new priority : " + t.getPriority());
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
		
		// A Child thread class
		class ChildThread extends Thread {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Child Thread!");
				}
			}
		}
		
		// Main thread creating a child thread
		ChildThread childThread = new ChildThread();
		// starting child thread
		childThread.start();
		
		// Getting priority of child thread which will be inherited from main thread
		// as it is created by main thread
		System.out.println("Child thread priority : " + childThread.getPriority());
		
		// Setting the child thread to MIN(1)
		childThread.setPriority(MIN_PRIORITY);
		System.out.println("Child thread new priority : " + childThread.getPriority());
	}
}
