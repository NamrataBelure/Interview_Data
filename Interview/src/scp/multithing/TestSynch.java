package scp.multithing;

public class TestSynch {
	public static void main(String[] args) {
		Test t=new Test();
		Table3 t1=new Table3(t);
		Table4 t2=new Table4(t);
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
class Table3 extends Thread{
	Test t;
	Table3(Test t){
		this.t=t;
	}
   public void run() {
	  t.printTable(10);	
	}
}
class Table4 extends Thread{
	Test t;
    Table4(Test t) {
	this.t=t;
	}
    public void run(){
    	t.printTable(100);
    }
}