package concurrentThread.reenterentDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemoSimple2 extends Thread {

	static ReentrantLock l = new ReentrantLock();

	public void run() {

		do {
			try {
				if (l.tryLock(3000, TimeUnit.MILLISECONDS)) {
					System.out.println("Get Lock " + Thread.currentThread().getName());
					try {
						Thread.sleep(30000);
						System.out.println("========");
						l.unlock();
						break;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println(Thread.currentThread().getName() + " Didn't get the lock");
					System.out.println("Trying again to get the lock...\n");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);
	}

	public static void main(String[] args) {
		ReentrantLockDemoSimple2 t1 = new ReentrantLockDemoSimple2();
		ReentrantLockDemoSimple2 t2 = new ReentrantLockDemoSimple2();

		t1.start();
		t2.start();

	}

}
