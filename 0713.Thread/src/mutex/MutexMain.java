package mutex;

public class MutexMain {

	public static void main(String[] args) {
		Mutex mutex = new Mutex();
		Thread th = new Thread(mutex);
		th.start();
		Thread th1 = new Thread(mutex);
		th1.start();

		//25초 후에 mutex의 result값 확인
		try {
			Thread.sleep(25000);
			System.out.println(mutex.getResult());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
