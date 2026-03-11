package threadDemo;

public class MainThreadDemo {
	public static Thread mainThread;
	public static TicketSystem ticketSystem;

	public static void main(String[] args) {
		ticketSystem = new TicketSystem();
		mainThread = new Thread(ticketSystem);

		System.out.println("State after creating mainThread: " + mainThread.getState());

		mainThread.start();
		System.out.println("State after starting mainThread: " + mainThread.getState());
	}

}
