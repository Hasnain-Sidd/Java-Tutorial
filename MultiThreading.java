class CountryCapital{
	public void method1() {
		System.out.println("The Capital Of Pakistan Is:");
	
	try {
		Thread.sleep(1000);
	}
	catch(InterruptedException ex) {
		System.out.println(ex);
	}
	System.out.println("Islamabad");
	
	try {
		Thread.sleep(1000);
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
	System.out.println("The Capiatl OF Iran Is:");
	System.out.println("Tehran");
	}
}
class MyThreads extends Thread{
	CountryCapital cc=new CountryCapital();
	public void  method2(CountryCapital cc) {
		this.cc=cc;
	}
	public void run() {
		cc.method1();
	}
}
public class MultiThreading {
	public static void main(String[] args) {
		CountryCapital cc1=new CountryCapital();
		MyThreads t1=new MyThreads ();
		MyThreads t2=new MyThreads ();
		t1.method2(cc1);
		t2.method2(cc1);
		t1.start();
		t2.start();
		
		
		

}
}
