package concurrentThread.reenterentDemo;

import java.util.concurrent.locks.ReentrantLock;

public class Display {

	ReentrantLock l= new ReentrantLock();
	
	public void showDisplay(String name) {
		
		l.lock();
		System.out.println("Good morning ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(name+"\n");
		l.unlock();
		
	}
	
}
