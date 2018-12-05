package scp.multithing;

public class multithreadingDemo1 {

	public static void main(String[] args) {
	   myThread mt=new myThread();
	   Thread t=new Thread(mt);
	   t.start();
	   mythreadd mt2=new mythreadd();
	   mt2.start();
	}

}
class myThread implements Runnable{
	@Override
	public void run() {
	System.out.println("runnable thread");
	}
}
class mythreadd extends Thread{
	@Override
	public void run() {
	System.out.println("extends thread");
	}
}