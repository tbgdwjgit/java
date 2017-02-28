import java.util.*;

public class ListTest{

    public static void main(String args[]){
        //List
        List<String> list = new ArrayList<String>();
        list.add("123");

    	//ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(321);
        al.add(123);
        al.add(231);
        // al.set(1,222);
        // al.remove(1);
        Collections.sort(al);

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
        LinkedList<String> al2 = new LinkedList<String>();
        al2.add("This");
        al2.add("is");
        al2.add("an");
        al2.add("apple");
        al2.add("!!");
        Iterator<String> iter3 = al2.iterator();  
        while(iter3.hasNext()){  
            System.out.println(iter3.next());  
        } 

        //Vector(ArrayList)
        Vector<String> Vr = new Vector<String>();
        Vr.add("This");
        Vr.add("is");
        Vr.add("an");
        Vr.add("apple");
        Vr.add("!!!");
        Iterator<String> iter4 = Vr.iterator();  
        while(iter4.hasNext()){  
            System.out.println(iter4.next());  
        } 







    }

























}