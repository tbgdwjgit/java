public class ForTest{
    public static void main(String args[]){	
    	  int i = 0;
        for(foo('B'); foo('A') && (i < 2); foo('D')) {
            i++;
            foo('C');
        }	  
	  }
	
	  public static boolean foo(char c) {
        System.out.print(c);
        return true;
    }
}
