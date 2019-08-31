package producerConsumerProblem;

public class ProducerConsumerRunner {

	public static void main(String[] args) {

		System.out.println("=Main Thread=");
		
		Producer producer= new Producer();
		producer.setName("producer-thread");
		
		producer.start();
		
		Consumer consumer= new Consumer(producer);
		consumer.setName("consumer-thread");

		consumer.start();
		
	}

}
