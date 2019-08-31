package deadlock;

public class DeadlockDemo extends Thread {

	
	A a = new A();
	B b= new B();
	
	DeadlockDemo(){
		this.start();
		a.foo(b);
	}
	
	public void run() {
		b.bar(a);
	}
	
	public static void main(String[] args) {

		new DeadlockDemo();
		
	}

}
