package scp.multithing;

public class Demo3 {

	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();//its store output...
		td.start();//run time error throw new IllegalThreadStateException();
                  //only one time we can use start method....
	}

}
class ThreadDemo extends Thread{
	public void run(){
		System.out.println("using Dual start method,...");
	}
}