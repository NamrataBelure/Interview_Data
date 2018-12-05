package ArrayListImpl;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationWithArrayListSubList {

	public static void main(String[] args) {
	List<String>names=new ArrayList<>();
	names.add("Anu");
	names.add("Akash");
	names.add("Namu");
	names.add("bhagya");
    List<String>fName=names.subList(0,2);
    System.out.println(names +","+ fName);
    names.set(1,"Aiush");
    System.out.println(names +","+ fName);
   /* names.add("akashy");//Exception
    System.out.println(names +","+fName);*/
	}

}
