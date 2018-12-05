package interview.java.iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.Vector;


public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Map<Books, String> booksmap = new HashMap<>();

				Books b1 = new Books(101, "Let", "Yashwant", "BPB", 8);
				Books b2 = new Books(102, "Data", "Forouzan", "Mc", 4);
				Books b3 = new Books(103, "Os", "Galvin", "Wiley", 6);
		        Books b4=b3;
		        Books b5=null;
		        
				booksmap.put(b1, "x1");
				booksmap.put(b2, "x2");
				booksmap.put(b3, "x3");
				booksmap.put(b4, "x4");
				booksmap.put(b5, "x5");
				
				
			  System.out.println("1.using keyset:...");
			  Set<Books> bookSet = booksmap.keySet();
			  Iterator<Books> bookitr = bookSet.iterator();
				
			  while (bookitr.hasNext()) 
			  {
					Books integer = bookitr.next();
					System.out.print("\nkeys:" + booksmap + ":");
					System.out.print("\nvalues:" + booksmap.get(integer));
			  }

			  System.out.println("\n 2.Iterating over Map.entrySet() using For-Each loop");
			  for(Entry<Books, String> entry:booksmap.entrySet())
			  { 
				 Books key=entry.getKey(); 
				 String b=entry.getValue();
			     System.out.println("Details.."+key);
			  }
			
			  System.out.println("3.Using EntrySet:.....");  
			  Set<Entry<Books,String>> setOfEntry=booksmap.entrySet();
			  Iterator<Entry<Books,String>>entryItr=setOfEntry.iterator();
				  
			  while (entryItr.hasNext())
			  {
					Map.Entry<Books,String> entry = entryItr.next();
					System.out.println("\nKeys: "+entry.getKey()+" values: "+entry.getValue());
			  }
				
			  System.out.println("\n4.Iterating using iterators over Map.Entry<K, V>");
			  Iterator<Entry<Books, String>>itr=booksmap.entrySet().iterator();
			  
			  while (itr.hasNext()) 
				 
			  { 
				   Entry<Books, String> entry =itr.next();
				   System.out.print("\n keys : "+entry.getKey()+ " values : "+entry.getValue());
			  }
			
			  System.out.println("5.using Values:");
			  Collection<String>values=booksmap.values();
			  List<String>listOfValues=new ArrayList<>(values);
			  System.out.println(listOfValues);		  

			  System.out.println("6.using Enumerator:");
			  Enumeration e=new Vector(bookSet).elements();
			  while (e.hasMoreElements()) {
				System.out.println(e.nextElement()); 
			}
			  System.out.println("7.using ForEach");
			  for (String books: listOfValues) {
				System.out.println("values : "+books);
			}
			  System.out.println("8.Iterator using for loop:");
			  Set<Books>book=booksmap.keySet();
			  for (int i = 0; i < book.size(); i++) {
				  System.out.println("keys..."+book);
			}
		   
			  System.out.println("9.iterator using list Enumerator:");
			  Enumeration<Books>listofEnum=Collections.enumeration(bookSet);
			  while (listofEnum.hasMoreElements()) {
				System.out.println(listofEnum.nextElement());	
			}
			  System.out.println("10.iterator using hashset:");
			  Set<Books>hashset=new HashSet<Books>();
			  hashset.add(b2);
			  Iterator<Books>itr1=hashset.iterator();
			  while (itr1.hasNext()) {
				System.out.println( itr1.next());	
			}
		     System.out.println("11.iterator using arrayList:");
		     List<Books>arrayList=new ArrayList<Books>();
		     arrayList.add(b4);
		     Iterator<Books>iterator=arrayList.iterator();
		     while (iterator.hasNext()) {
		     System.out.println(iterator.next());
		   }
		     System.out.println("12.list using enhanced foreach loop");
		    for (Books books : arrayList) {
		    	System.out.println(books);
		    	}
			}
		}

