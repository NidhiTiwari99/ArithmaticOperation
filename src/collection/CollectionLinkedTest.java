package collection;
import java.util.*;

public class CollectionLinkedTest {
	
	public static void main(String args[]){  
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("Nidhi");  
		ll.add("Vidhi");  
		ll.add("Sonam");  
		ll.add("Shivam");  
		Iterator<String> itr=ll.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
