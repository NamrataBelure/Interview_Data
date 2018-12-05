package interview.java.ass.Array;

public class MatchingElement {

	public static void main(String[] args) {
	int a[]={3,4,7,8,5,6};
	int b[]={3,6,5,8,9,2};
	for (int i = 0; i < b.length; i++) {
		for (int j =0; j < b.length; j++) {
			if(a[i]==b[j]){
				System.out.println("Matching element is:"+a[i]);
			}
		}
	  }
	}
}
