package mutex;

import java.util.ArrayList;

public class Producer extends Thread {
	public ArrayList<Character> list;

	// 생성자
	public Producer(ArrayList<Character> list) {
		this.list = list;

	}

	// 스레드로 수행할 메소드
	private synchronized void save() {
		// 1초씩 쉬면서 26번 동작

		for (int i = 0; i < 26; i++) {
			char ch = (char) (65 + i);
			System.out.println(ch + "를 저장합니다");
			list.add(ch);
			//wait 중인 스레드 깨우기
			notifyAll();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

	// Thread로 동작 할 Method
	public void run() {
		save();
	}
}
