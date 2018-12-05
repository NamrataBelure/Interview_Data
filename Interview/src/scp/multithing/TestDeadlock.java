package scp.multithing;

public class TestDeadlock {

	public static void main(String[] args) {
		final String resources1="Aunshri";
		final String resources2="Tanushri";
            Thread t1=new Thread(){
            	public void run(){
            		synchronized (resources1) {
						System.out.println("Thread1:locked resources1");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {}
					 synchronized (resources2) {
						System.out.println("Thread 1:locked resources2");
					   }	
					}
            	}
            };
           Thread t2 =new Thread(){
        	   public void run(){
        		   synchronized (resources2) {
					System.out.println("Thread2:locked resources2");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {}
					synchronized (resources1) {
						System.out.println("Thread2:loacked resources1");
					}
				  }
        	   }
           };
           t1.start();
           t2.start();
	}
}
