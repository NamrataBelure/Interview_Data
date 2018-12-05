package scp.multithing;

public class SychroTestBlock {
	public static void main(String[] args) {
	Test2 obj=new Test2();
	MyThread1 t1=new MyThread1(obj);  
	MyThread2 t2=new MyThread2(obj);  
	t1.start();  
	t2.start();  

	}

}
class Test2{
	void printTable(int n){
		synchronized(this){
			for (int i = 1; i < 10; i++) {
				System.out.println(n*i);
			}
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class MyThread1 extends Thread{  
Test2 t;  
MyThread1(Test2 t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
Test2 t;  
MyThread2(Test2 t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
	
