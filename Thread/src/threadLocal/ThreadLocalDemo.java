package threadLocal;

public class ThreadLocalDemo {

	public static void main(String[] args) {

		ThreadLocal l = new ThreadLocal();

		System.out.println(l.get());

		l.set("Naren");
		System.out.println(l.get());
		l.remove();
		System.out.println(l.get());

		l.set("Pappu");

		System.out.println(l.get());

	}

}
