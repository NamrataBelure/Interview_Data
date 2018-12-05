package scp.multithing.InterThred;

public class pcTestMain {

	public static void main(String[] args) {
	ProcedureAndConsume pc=new ProcedureAndConsume();
	Procedure p=new Procedure(pc);
	Consume c=new Consume(pc);
	p.start();
	c.start();
	}

}
