import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class CollectionTest{
    public static void main(String args[]){

    	//ArrayList
        // ArrayList<Integer> al = new ArrayList<Integer>(); 
        // al.add(3);
        // System.out.println(al.size());  

        Student s1 = new Student("tt",10);
        Student s2 = new Student("ww",10);
        Student s3 = new Student("tt",10);
        ArrayList<Student> als = new ArrayList<Student>();
        als.add(s1);
        als.add(s2);
        als.add(s3); 
        System.out.println(als.size()); 
        //System.out.println(als.contains(s1)); 
        System.out.println(s1.equals(s3));



    	//LinkedList
        // LinkedList<String> ll = new LinkedList<String>(); 
        // ll.add("test");
        // System.out.println(ll.size());  

        //Map
        Map<String,String> map = new HashMap<String,String>();
        map.put("qd1","dsds1");
        map.put("qd2","dsds2");
        map.put("qd3","dsds3");
        map.put("qd4","dsds4");
        System.out.println(map.size());
        System.out.println(map.get("qd3"));


    }

}


class Student{
	String name;
	int age;

	public Student(){
		super();
	}

	public Student(String n,int a){
		this.name=n;
		this.age=a;
	}

	@Override
	public int hashCode()
	{
		return name.hashCode()+age;
	}

    @Override
    public boolean equals(Object obj){
    	System.out.println("111"); 
        if(this==obj){
        	System.out.println("112");  
            return true;
        }
        if(obj == null){
        	System.out.println("113"); 
            return false;
        }

        if(getClass() != obj.getClass()){
        	System.out.println("114"); 
            return false;
        }

        if(!(obj instanceof Student)){
        	System.out.println("115"); 
            return false;
        }
        System.out.println("116"); 
        Student stu = (Student)obj;
 
        return name.equals(stu.name) && age == stu.age ;


		// if(!(obj instanceof Student))
		// 		return false;
		// Student stu = (Student)obj;
		// return this.name.equals(stu.name)&&this.age==stu.age;
	}	
}

















