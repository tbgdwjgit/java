import java.util.*;

class ShortSet{

    private static String a; 
    private static String b; 

    static void doSomething () {
      String s = "";
      int l = s.length();
    }

 
    public static void main(String[] args) { 
        String c = a+b; 
        //System.out.println(null); 
        System.out.println(c); 
        sort();


    }

    static void sort(){
      int [] array={51,31,71,9,1,21};
      for(int i=0;i<array.length-1;i++){
        for(int j=0;j<array.length-i-1;j++){
          if(array[j]>array[j+1]){
            int emp=  array[j];
            array[j]=array[j+1];
            array[j+1]=emp;
          }
        }
      }

      for(int i:array){
        System.out.println(i);
      }
    }

    // public static void main(String args[]) {
    // 	// try{
    //  //    // Set s=new HashSet();
    //  //    // //for(Short i=0;i<100;i++) {
    //  //    //     s.add("a");
    //  //    // //    s.remove(i-1);
    //  //    // //}
    //  //    // System.out.println(s.size());

    //  //       String[] s = new String[10];
    //  //       System.out.println(s[9]);

    //  //       System.out.println("\\'123");

    //  //       int i = 0xFFFFFFF1;
    //  //       int j = ~i;
    //  //       System.out.println(j);

    //  //       }catch(Exception e){
    //  //    	   e.printStackTrace();
    //  //    }	

    //  // short s1 = 1; 
    //  // s1 = (short)(s1 +1);
    //  short a = 1; 
    //  a=(short)(a+(short)10);

    //  short s1 = 1; 
    //  s1 += 1;

    // }

}

class testMain{
    public static void main(String[] args) {        
        System.out.println("Do something ...");
    }
}

abstract class Name {
    private String name;
    public abstract boolean isStupidName(String name);
}
