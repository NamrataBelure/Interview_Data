package scp.multithing;
public class TestSychronchronization {
	public static void main(String[] args) {
		Test t=new Test();
		MyTable3 t1=new MyTable3(t);
		MyTable4 t2=new MyTable4(t);
		t1.start();
		t2.start();
	}
}
class Test{
	synchronized void printTable(int n){
		for (int i = 1; i <=5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			    }catch (Exception e) 
			      {
				System.out.println(e);
		    }
		}
	}
}
class MyTable3 extends Thread{
	Test t;
	MyTable3(Test t){
		this.t=t;
	}
   public void run() {
	  t.printTable(10);	
	}
}
class MyTable4 extends Thread{
	Test t;
    MyTable4(Test t) {
	this.t=t;
	}
    public void run(){
    	t.printTable(100);
    }
}