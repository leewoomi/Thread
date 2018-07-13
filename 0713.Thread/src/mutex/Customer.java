package mutex;

import java.util.ArrayList;

public class Customer extends Thread {

	public ShareData sharedata;

	public Customer(ShareData sharedata) {
		this.sharedata = sharedata;
	}

	

	public void run() {
		for (int i = 0; i < 26; i++) {
			sharedata.get();
		}
	}

}
