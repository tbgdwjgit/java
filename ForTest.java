public class ForTest{
    public static void main(String args[]){	
    	  int i = 0;
        for(foo('B'); foo('A') && (i < 2); foo('D')) {
            i++;
            foo('C');   
        }

        String tmp="";
        String arr[]={"This","is","a","test","!"};
        //foreach
        for(String str :arr){
            if (str=="This"){
               tmp=tmp+str; 
            }else{
                tmp=tmp+" "+str;
            }
        } 
        System.out.print(tmp);
	}
	
	  public static boolean foo(char c) {
        System.out.println(c);
        return true;
    }
}
