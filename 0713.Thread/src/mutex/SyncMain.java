package mutex;

public class SyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producer p = new Producer(ShareData.List);
		Customer c = new Customer(ShareData.List);
		
		p.start();
		c.start();
	}

}
