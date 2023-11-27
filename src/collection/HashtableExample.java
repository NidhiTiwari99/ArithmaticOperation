package collection;
import java.util.*;  

public class HashtableExample {

	 public static void main(String args[]){  
	    Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Nidhi");    
	     map.put(102,"Vidhi");   
	     map.put(101,"Sonam");    
	     map.put(103,"Shivam");    
	     System.out.println(map.getOrDefault(101, "Not Found"));  
	     System.out.println(map.getOrDefault(105, "Not Found"));  
	 }  
	}  
