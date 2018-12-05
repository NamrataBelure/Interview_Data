package demo.interview;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class status {
	public static void main(String[] args) throws ParseException {
		int status=300;
		String pid="a";
		DateFormat df=new SimpleDateFormat("DD-MM-YYYY");
		Date sysdate=(Date) df.parse("01-12-2019");
		Date currentdate=(Date) df.parse("12-03-2018");
		if ((status==300||status==400||status==500)&&((pid.equals("a"))||(pid.equals("b"))||(pid.equals("c"))&&(currentdate==sysdate))) {
			System.out.println("red");
		}else
		{
			System.out.println("green");
		}
	}
}
