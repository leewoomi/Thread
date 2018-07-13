package mutex;



public class Producer extends Thread {
	public ShareData sharedata;

	// 생성자
	public Producer(ShareData sharedata) {
		this.sharedata = sharedata;

	}

	// Thread로 동작 할 Method
	public void run() {
		for (int i = 0; i < 26; i++) {
			sharedata.save((char) (65 + i));
		}
	}
}
