package scp.multithing.InterThred;

public class Consume extends Thread{

	ProcedureAndConsume p;
	public Consume(ProcedureAndConsume p) {
        this.p=p;
        
	}
	public void run(){
		p.consume();
	}
	public void start() {
	p.consume();
		
	}
}
