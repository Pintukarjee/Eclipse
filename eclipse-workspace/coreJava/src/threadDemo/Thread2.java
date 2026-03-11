package threadDemo;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		String str = "Thread is running successfully...";
		System.out.println(str);
	}

	public static void main(String[] args) {
		Thread2 t = new Thread2();
		Thread t1 = new Thread(t);

		t1.start();
	}

}
