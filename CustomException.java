import java.util.Scanner;
class InvalidEmailException extends Exception{
	public String toString() {
		return "Registration Failed Due To Invalid Email";
	}
}
class Demo{
	 public void Register(String email ,String password)  throws InvalidEmailException{ 
		 if(email!="@") {
			 throw new InvalidEmailException();
		 }
	 }
}
public class CustomException {
public static void main(String[] args) {
	Demo D=new Demo();
	String a;
	String e;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The Emai");
	a=sc.nextLine();
	//System.out.print("Enter The Password ");
	e=sc.nextLine();
	try {
		
		D.Register(a,e);
		System.out.println("Email Registered Successfully");
	}
	catch(Exception ex) {
		System.out.println(ex);
		ex.printStackTrace();
	}
    sc.close();
}
}

