package deadlock;

public class A {

	
	public synchronized void foo(B b) {
		
		System.out.println(Thread.currentThread().getName()+ " Thread using foo ");
		
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
		}
		
		System.out.println(Thread.currentThread().getName()+" trying to call b's last method");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("==Inside A's Last method.==");
	}
	
}
