package producerConsumerProblem;

public class Consumer extends Thread{

	private Producer producer;
	
	Consumer(Producer producer){
		this.producer=producer;
	}
	
	public void run() {
		System.out.println("===consumer thread called========");
		try {
			while(true) {
				String msg= producer.consume();
				System.out.println("Consumed by: " + Thread.currentThread().getName() + " data: " + msg);
				Thread.sleep(500);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
