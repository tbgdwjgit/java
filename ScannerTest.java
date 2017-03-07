import java.util.Scanner;

public class ScannerTest{
	public static void main(String args[]){
        while(true){
          System.out.println("Y/N");  
          Scanner sc =new Scanner(System.in);
          String a =sc.next();
          if (a.equals("N")){
            System.out.println("input:"+a);
            break;
          }

        }
	}
}