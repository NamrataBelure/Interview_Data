package scp.multithing;

public class tsetWithoutSychro {

	public static void main(String[] args) {
		Table obj=new Table();
		Mythread3 t1=new Mythread3(obj);
		MyThread4 t2=new MyThread4(obj);
		t1.start();
		t2.start();
	}

}
class Table{
	void printTable(int n){
		for (int i = 1; i < 5; i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		    System.out.println(e);
		}
	}
}
class Mythread3 extends Thread{
	
		Table t;
		Mythread3(Table t){
			this.t=t;
			
		}
		public void run(){
			t.printTable(5);
	}
}

class MyThread4 extends Thread{  
          Table t;  
          MyThread4(Table t){  
             this.t=t;  
          }  
         public void run(){  
            t.printTable(100);  
         }  
}  
