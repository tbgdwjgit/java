class Super {
	public Integer getLenght() { 
	    return new Integer(4); 
	}
}

public class OverrideTest extends Super{
	public Long getLenght() {    
	    return new Long(5); 
	}

	public static void main(String[] args) {
	    Super sooper = new Super();
	    OverrideTest sub = new OverrideTest();
	        System.out.println(sooper.getLenght().toString() + "," + sub.getLenght().toString() );
	    }

}
