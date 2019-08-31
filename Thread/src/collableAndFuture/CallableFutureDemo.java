package collableAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
	public static void main(String[] args) {

		MyCallable[] myJobs = { new MyCallable(10), new MyCallable(5), new MyCallable(7), new MyCallable(20) };

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (MyCallable job : myJobs) {
			Future furure = service.submit(job);
			try {
				System.out.println(furure.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}
}
