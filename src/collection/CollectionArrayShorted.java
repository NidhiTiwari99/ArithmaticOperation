package collection;
import java.util.*;  

class CollectionArrayShorted{  
 public static void main(String args[]){   
  List<String> list=new ArrayList<String>();  
  list.add("Mango");  
  list.add("Apple");  
  list.add("Banana");  
  list.add("Grapes");  
  Collections.sort(list);  
  for(String fruit:list)  
    System.out.println(fruit);  
      
 System.out.println("Sorting numbers...");    
  List<Integer> list1=new ArrayList<Integer>();  
  list1.add(21);  
  list1.add(11);  
  list1.add(51);  
  list1.add(1);  
  Collections.sort(list1);  
  for(Integer number:list1)  
    System.out.println(number);  
 }  
   
}  

