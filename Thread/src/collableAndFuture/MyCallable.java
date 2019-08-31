package collableAndFuture;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

	int num;
	MyCallable(int num){
		this.num= num;
	}
	
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName() 
				+ " is responsible to find sum of first "+num);
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum= sum+i;
		}
		
		return sum;
	}

}
