package scp.multithing.InterThred;

public class Procedure extends Thread {

	ProcedureAndConsume  p;
	 Procedure(ProcedureAndConsume p) {
		this.p=p;
	}
	 public void run(){
		 p.procedure();
	 }
}
