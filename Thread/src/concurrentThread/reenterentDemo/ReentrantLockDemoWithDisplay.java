package concurrentThread.reenterentDemo;

public class ReentrantLockDemoWithDisplay {

	public static void main(String[] args) {
		
		Display display= new Display();
		MyThread t1 = new MyThread(display, "Dhoni");
		MyThread t2 = new MyThread(display, "Yovraj");
		
		t1.start();
		t2.start();
	}
	
}
