package thread;

public class ThreadDemoX extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
			Thread.sleep(150);
			}catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ThreadDemoX t1=new ThreadDemoX();
		ThreadDemoX t2=new ThreadDemoX();
		ThreadDemoX t3=new ThreadDemoX();
		ThreadDemoX t4=new ThreadDemoX();
		t1.setName("1St Thread");
		t2.setName("2Nd Thread");
		t3.setName("3Rd Thread");
		t4.setName("4Th Thread");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t4.setPriority(7);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
