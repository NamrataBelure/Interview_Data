package VarArgs;

public class varArgs {
	
		static void vaTest(int...a){
			System.out.println("vaTest(int...) : "+"NumberOfArgs : "+ a.length +" Contents : ");
			for (int i : a) {
				System.out.println(i+"");
				System.out.println();
			}
		}
		static void vaTest(boolean...b1){
			System.out.println("vaTest(boolean...): "+"NumberOfArgs : "+ b1.length + " Contents : ");
		    for (boolean b : b1) {
				System.out.println(b+"");
				System.out.println();
			}
		}
		static void vaTest(String msg,int...no){
			System.out.println("vaTest(String,int...): "+msg+"NumberOfArgs : "+ no.length + " Contents : ");
			for (int i : no) {
				System.out.println(no+"");
				System.out.println();
			}
		}
		public static void main(String[] args) {
	      vaTest(1,2,3);
	      vaTest("Testing:"+10,20);
	      vaTest(true,false,false);
	      
		}

}
