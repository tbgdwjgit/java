import java.util.Date;
import java.text.SimpleDateFormat;

public class StringTest{
	public static void main(String args[]){
        String a = "abc";
        String b = "abc";
        System.out.println(a==b);//true
        System.out.println(a.equals(b));//true

        String c = new String("abc");
        String d = new String("abc");
        System.out.println(c==d);//false
        System.out.println(c.equals(d));//true

        StringBuffer sb = new StringBuffer();
        sb.append("abcd");
        sb.append("www");
        System.out.println(sb.toString());


        Date now = new Date();
        System.out.println(getDate(now));

        String str = "abcd";
        char ca[] = str.toUpperCase().concat("ef").toCharArray();
        for(char cr:ca){
            System.out.println(cr);
        }


	}

        public static String getDate(Date date){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
            String str = sdf.format(date);   
            return str;                  
        }
}