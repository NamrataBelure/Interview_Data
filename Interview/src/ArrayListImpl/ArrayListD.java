package ArrayListImpl;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListD {

	public static void main(String[] args) {
		ArrayListD al=new ArrayListD();
		System.out.println("Arraylist is Empty:"+al.CheckIsEmpty());

		al.Add(new Integer(12));
		al.Add(new Integer(15));
		al.Add(new Integer(14));
		al.Add(new Integer(13));
		al.Add(new Integer(11));
		
		for (int i = 0; i < al.SizeInc(); i++) {
		System.out.print("["+al.get(i)+"]");
		}
		System.out.println("\nArray size before Delete: "+ al.arraySize);
		al.DeleteElement(2);
		System.out.println("Array size after Delete:"+al.arraySize);
		
		for (int i = 0; i < al.SizeInc(); i++) {
			System.out.print("["+al.get(i)+"]");
		}
		System.out.println("\nArray list is empty:"+al.CheckIsEmpty());
		al.makeClear();
		for (int i = 0; i < al.SizeInc(); i++) {
			System.out.println("["+al.get(i)+"]");
   		}
        System.out.println("Array list is empty:"+al.arraySize);
        System.out.println("ArrayList is empty:"+al.CheckIsEmpty());
     }

     private static Object[]ELEMENTS;
     private int arraySize;

     public ArrayListD() {
     ELEMENTS=new Object[10];
      }
    public Object get(int index){
	if (index<arraySize) {
		return ELEMENTS[index];
	       }
	else
		throw new ArrayIndexOutOfBoundsException("Array is over flow....");
      }

    public void Add(Object obj){
	if (ELEMENTS.length-arraySize<=5) {
		increaseSize();
	   }
	 ELEMENTS[arraySize++]=obj;
     }
    private void increaseSize() {
	ELEMENTS=Arrays.copyOf(ELEMENTS, ELEMENTS.length*3/2+1);
	System.out.printf("\n New length:",+ELEMENTS.length);		
    }
    public int SizeInc(){
	return arraySize;
      }
    private boolean CheckIsEmpty() {
	return arraySize==0;
	}
   public Object DeleteElement(int index){
	if (index<arraySize) {
		Object obj=ELEMENTS[index];
		ELEMENTS[index]=null;
		int temp=index;
		while (temp<arraySize) {
			ELEMENTS[temp]=ELEMENTS[temp+1];
			ELEMENTS[temp+1]=null;
			temp++;	
		}
		arraySize--;
		return obj;
	}else
	throw new ArrayIndexOutOfBoundsException("Array capacity overflow:");	
  }
   public void makeClear(){
	int count=0;
	count++;
	for (int i = 0; i < arraySize; i++) {
	  ELEMENTS[i]=null;
	  arraySize=0;
	}
  }
}
