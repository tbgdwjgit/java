class Super1{
    String s = "Super";

    public Super1(){
    	System.out.println(s);
    }
    public Super1(String s){
    	this.s = s;
    	System.out.println(s);
    }

}

public class SuperSubTest extends Super1{
	int x = 200;

    public SuperSubTest(){
		System.out.println("Sub");
    }

    public SuperSubTest(String s){
    	super("Sub");
    	System.out.println(s);	
    }

	public static void main(String args[]){
		SuperSubTest SST = new SuperSubTest();
		SuperSubTest SST1 = new SuperSubTest("123");

	}


}