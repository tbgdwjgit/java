public class ThreadTest extends Thread{

    public void run(){
    	System.out.println("ThreadTest");
    }

	public static void main(String args[]){
		//
        ThreadTest tt = new ThreadTest();
        tt.start();
        System.out.println(tt.getName());

        Thread tri1 = new Thread(new RunnableTest());
	    tri1.start();
        System.out.println(tri1.getName());

	}
}

class RunnableTest implements Runnable{
    public void run(){
    	System.out.println("RunnableTest");
    }
}