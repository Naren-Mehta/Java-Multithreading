package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {

		PrintJob[] jobArr = { new PrintJob("Naren"), new PrintJob("Deepak"), new PrintJob("Prema"),
				new PrintJob("Ujjwal"), new PrintJob("Ashish"), new PrintJob("Paul") };

		ExecutorService service = Executors.newFixedThreadPool(6);

		for (PrintJob job : jobArr) {
			service.submit(job);
		}

		service.shutdown();

	}

}
