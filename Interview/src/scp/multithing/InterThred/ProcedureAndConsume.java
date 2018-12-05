package scp.multithing.InterThred;

public class ProcedureAndConsume {

	Boolean flag=true;
	int count=0;
	public synchronized void procedure(){
		try {
			while (true) {
				if (flag==true) {
					count=count+1;
					System.out.println("procedure procedure item:"+count);
				   flag=false;
				   notify();
				   wait();
				}
				else{
					wait();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void consume(){
		try{
			while (true) {
				if (flag==true) {
					
					wait();
				}
				else{
					System.out.println("consume consumer item:"+count);
					flag=true;
					notify();
					wait();
				}
			}
		}
			catch (Exception e) {
				e.printStackTrace();
		}
	}
}
