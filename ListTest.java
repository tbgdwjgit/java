import java.util.*;

public class ListTest{

    public static void main(String args[]){
    	//ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(321);
        al.add(123);
        al.add(231);
        //System.out.println(al.size());
        Iterator<Integer> iter1 = al.iterator();  
        while(iter1.hasNext()){  
            System.out.println(iter1.next());  
        }         

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("This");
        al1.add("is");
        al1.add("an");
        al1.add("apple");
        al1.add("!");
        //System.out.println(al1.size());
        Iterator<String> iter2 = al1.iterator();  
        while(iter2.hasNext()){  
            System.out.println(iter2.next());  
        } 
        







    	//LinkedList

    }

























}