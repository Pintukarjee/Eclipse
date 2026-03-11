package threadDemo;

public class TicketSystem implements Runnable {
	
	public static Thread mainThread;

	@Override
	public void run() {
		TicketBooking booking = new TicketBooking();
		Thread bookingThread = new Thread(booking);

		System.out.println("State after bookingThread: " + bookingThread.getState());

		bookingThread.start();
		System.out.println("State after starting bookingThread: " + bookingThread.getState());

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("State after sleeping bookingThread: " + bookingThread.getState());

		try {
			bookingThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State after booking thread finishes: " + bookingThread.getState());
	}

}
