package thread;

//Thread를 상속 받음 .
public class ThreadEx1 extends Thread {

	public void run() {
		// 스레드로 수행할 내용
		// 1초씩 쉬면서 0-9까지 순서대로 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				//1초씩 쉬면서..
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("끝");
	}

}
