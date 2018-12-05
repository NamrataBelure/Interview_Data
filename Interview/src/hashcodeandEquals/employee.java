package hashcodeandEquals;

public class employee {
private String name;
private int eId;
private int Salary;
@Override
public String toString() {
	return "\nemployee [name=" + name + ", eId=" + eId + ", Salary=" + Salary + "]";
}

public employee(String name, int eId, int salary) {
	super();
	this.name = name;
	this.eId = eId;
	Salary = salary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int geteId() {
	return eId;
}

public void seteId(int eId) {
	this.eId = eId;
}

public int getSalary() {
	return Salary;
}

public void setSalary(int salary) {
	Salary = salary;
}
public int hashCode(){
    final int prime=17;
    int result=1;
    return result=result*prime+eId;
    
	//return this.geteId();
}
public boolean equals(Object obj){
	if(this==obj){
		return true;
	}else if(obj==null){
	return false;
	}
	else if(getClass()!=obj.getClass()){
		return false;
	}
	return true;
	/*employee e= null;
	if (obj instanceof employee) {
		 e=(employee) obj;	
	}
	
	if (this.geteId()==e.geteId()&&this.name.equals(e.name)) {
		return true;
	}
	else{
		return false;
	}*/
  }
}
