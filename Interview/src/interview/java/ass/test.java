package interview.java.ass;

public class test {
/* static void fun(int...a){
	 System.out.println("number of arguments..." +a.length);
	 for (int i : a) {
		System.out.println(i+ "");
		System.out.println();
	}
 }*/
	static void fun2(String s,int...b){
		System.out.println("string.."+s);
		System.out.println("number of argument is..."+b.length);
		for (int i : b) {
			System.out.println(i+"");
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
    /*fun();//no argument
    fun(100);//1 argument
    fun(1,2,3);//3 argument
*/  
		fun2("hello", 10);
		fun2("hiii",2,3,4);
	}

}
