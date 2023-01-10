package thread;

public class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"---Thread is Running");
		}

	public static void main(String[] args) {
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt,"My thread");
		t1.start();
	}

}
