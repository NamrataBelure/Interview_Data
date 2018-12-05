package scp.multithing;
public class Demo2 {
	public static void main(String[] args) {
		abc mt=new abc();
		mt.run();
	}
}
class abc extends Thread{
	public void run(){
		System.out.println("Directly calling run method without using start menthod...");
	}
}
