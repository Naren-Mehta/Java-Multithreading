package concurrentThread.reenterentDemo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemoSimple extends Thread {

	static ReentrantLock l = new ReentrantLock();
	
	public void run() {
		if(l.tryLock()) {
			System.out.println("Get Lock "+Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
				System.out.println("========");
				l.unlock();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Didn't get the lock "+Thread.currentThread().getName());
			System.out.println("doing something else");
		}
	}
	
	public static void main(String[] args) {
		ReentrantLockDemoSimple t1= new ReentrantLockDemoSimple();
		ReentrantLockDemoSimple t2= new ReentrantLockDemoSimple();
		
		t1.start();
		t2.start();

	}
	
}
