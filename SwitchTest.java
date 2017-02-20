public class SwitchTest{
	static enum E {
		    A, B, C, D
	}

	public static void main(String args[]){
		int i = 3;

		switch (i) {
			case 1 :
			    System.out.println(i);
			    break;
			case 2 :
				System.out.println(i);
				break;	
			case 3 :
				System.out.println(i);
				break;
			case 4 :
				System.out.println(i);
				break;	
			default :
				System.out.println(0);									

		}
 
        char chr = 'd';

		switch (chr) {
			case 'a' :
			    System.out.println(chr);
			    break;
			case 'b' :
				System.out.println(chr);
				break;	
			case 'c' :
				System.out.println(chr);
				break;
			case 'd' :
				System.out.println(chr);
				break;	
			default :
				System.out.println("Null");									

		}

        //jdk1.5
        E e = E.B;
        switch (e) {
	        case A:
	            System.out.println("A");
	            break;
	        case B:
	            System.out.println("B");
	            break;
	        case C:
	            System.out.println("C");
	            break;
	        case D:
	            System.out.println("D");
	            break;
	        default:
	            System.out.println(0);
        }

        //jdk1.7
		String str = "qC";
		switch (str) {
		case "AB":
		    System.out.println("AB");
		    break;
		case "BC":
		    System.out.println("BC");
		    break;
		case "qC":
		    System.out.println("qC");
		    break;
		default:
		    System.out.println(0);
		}

	}
}