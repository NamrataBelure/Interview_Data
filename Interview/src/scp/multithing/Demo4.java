package scp.multithing;

public class Demo4 {

	public static void main(String[] args) {
		threadDemo2 d2=new threadDemo2();
		d2.start();
	}
}
class threadDemo2 extends Thread{
	public void Start(){
		System.out.println("start method...");
	}
	public void run(){
		System.out.println("run method....");
	}
}