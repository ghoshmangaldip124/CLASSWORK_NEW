package thread;

public class ThreadDemo extends Thread{
	public ThreadDemo(String name) {
		super(name);
	}
	public void run() {
		System.out.println("Thraed is running"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadDemo td0=new ThreadDemo("\t 1st Thread");
		ThreadDemo td1=new ThreadDemo("\t 2nd Thread");
		ThreadDemo td2=new ThreadDemo("\t 3rd Thread");
		td0.start();
		td1.start();
		td2.start();
	}

}
