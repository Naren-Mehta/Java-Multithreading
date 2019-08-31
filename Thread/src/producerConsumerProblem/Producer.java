package producerConsumerProblem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread {

	public static final int MAX_SIZE = 3;

	public final List<String> messages = new ArrayList<String>();

	public void run() {

		try {
			while (true) {
				produce();
				System.out.println("=messages=" + messages);

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private synchronized void produce() throws InterruptedException {

		if (messages.size() == MAX_SIZE) {
			System.out.println("=waiting stock is ful=========================="+messages.size());
			wait();
			System.out.println("========Producer Got Notified from consumer============");
		}

		
		messages.add(LocalDateTime.now().toString());
		System.out.println("Producer Produced data....."+messages.size());
		notify();

	}

	public  synchronized String consume() throws InterruptedException {

		System.out.println("=size=========="+messages.size());
		
		notify();
		if (messages.isEmpty()) {
			System.out.println("=Waiting Stock is empty=====================================");
			wait();
		}
		
		System.out.println("========Consumer Got Notified============");

		String mes = messages.get(0);
		System.out.println("Consumed Date: " + mes);
		messages.remove(mes);
		
		return mes;
	}

}
