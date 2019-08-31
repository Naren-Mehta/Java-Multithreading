package concurrentThread.reenterentDemo;

public class MyThread extends Thread{

	private Display display;
	private String name;
	
	public void run() {
		display.showDisplay(name);
	}
	
	MyThread(Display display, String name){
		this.display=display;
		this.name=name;
	}
	
	
	
}
