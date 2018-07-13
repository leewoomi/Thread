package mutex;

import java.util.ArrayList;

public class Customer extends Thread {

	private ArrayList<Character> list;

	public Customer(ArrayList<Character> list) {
		this.list = list;
	}

	// list에서 26개를 꺼내서 출력하는 메소드
	public synchronized void get() {

		// list에 데이터가 없으면 대기
		if (list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 첫번째 데이터를 꺼내서 출력
		char ch = list.remove(0);
		System.out.println(ch + "를 소비했습니다.");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		for (int i = 0; i < 26; i++) {
			get();
		}
	}

}
