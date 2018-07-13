package thread;

public class ThreadMain {

	public static void main(String[] args) {
		// 앞에서 만든 클래스의 인스턴스를 만들고 run메소드를 호출
		/*
		 * ThreadEx1 thread1 = new ThreadEx1(); thread1.run();
		 * 
		 * ThreadEx1 thread2 = new ThreadEx1(); thread2.run();
		 * 
		 * ThreadEx1 thread3 = new ThreadEx1(); thread3.run();
		 */

		// 스레드로 실행
		ThreadEx1 thread = new ThreadEx1();
		thread.start();
		ThreadEx1 thread1 = new ThreadEx1();
		thread1.start();
		


	}

}
