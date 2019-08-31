package threadGroup;

public class SystemThreadGroupDemo {

	public static void main(String[] args) {
		
		ThreadGroup systemThreadGroup = Thread.currentThread().getThreadGroup().getParent();
		
		Thread[] threadArr= new Thread[systemThreadGroup.activeCount()];
		
		systemThreadGroup.enumerate(threadArr);
		
		for(Thread t : threadArr) {
			System.out.println(t.getName());
		}
		
	}
}
