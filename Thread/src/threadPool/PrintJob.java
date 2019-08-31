package threadPool;

public class PrintJob implements Runnable {

	String name;

	PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(name + " Job started by " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " Job completed by " + Thread.currentThread().getName());

	}

}
