package deadlock;

public class B {

	public synchronized void bar(A a) {

		System.out.println(Thread.currentThread().getName() + " Thread using foo ");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		System.out.println(Thread.currentThread().getName() + " trying to call A's bar method");
		a.last();

	}

	public synchronized void last() {
		System.out.println("==Inside B's Last method.==");
	}

}
