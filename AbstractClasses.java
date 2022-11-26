 abstract class Telephone{ 
	abstract void lift();
	abstract void disconnect();
	abstract void ring();
}
abstract class Greet{
	 public void Jesus() //Abstract Class 
	 {
		 System.out.println("Jesus Says : 'Hello ........' ");
	 }
	abstract void Muslims(); // Abstract Methods 
	abstract void Hindus(); // Abstract Methods 
	abstract void Christians(); // Abstract Methods 
	
}
 abstract class Pen{ 
	 public void  InkSpace() {
		 System.out.println("This Pen  has very large space for filling the ink......");
	 }
	  abstract void ChangeNib();
	 abstract void Write();
	 abstract void Refill();
 }
 class Way_Of_Greet extends Greet{
	 public void Muslims() {
		 System.out.println("Muslims Says :'Assalam-u-Alaikum' " );
	 }
	 public void Hindus() {
		 System.out.println("Hindus Says:'Namsate' ");
	 }
	 public void Christians() {
		 System.out.println("Christians Says: 'HI.........' ");
	 }
 }
 
 class Fountain_Pen extends Pen{
	 public void ChangeNib() {
		 System.out.println("Fountain Pen has different Nib than an ordinary Pen");
	 }
	
	 public void Write() {
		 System.out.println("*********************************************************");
		 System.out.println();
		 System.out.println("*********************************************************");
		 
		 System.out.println("This Pen has very writing ability........");
	 }
	 public void Refill() {
		 System.out.println("This Pen has also the option for refill the ink........");
	 }
 }
 class SmartPhone extends Telephone{
	 public void lift() {
		 System.out.println("*********************************************************");
		 System.out.println();
		 System.out.println("*********************************************************");
		 System.out.println("Smart  Phone can lift as Telephone");
	 }
	 public void disconnect() {
		 System.out.println("Smart Phone also disconnect as Telephone ");
	 }
	 public void  ring() {
		 System.out.println("Smart Phone can Ring.................");
		 
	 }
	 public void WiFi() {
		 System.out.println(" Smart Phone Has WiFi Ability but Telephone has not........");
	 }
	 public void  Camera() {
		 System.out.println("Smart Phone can click the picture by its camera ability but Telephone Can not.................");
	 }
	 public void Browser() {
		 System.out.println("Smart Phone  Can Search everything because it has browser but Telephone can not.........");
	 }
 }
public class AbstractClasses {
public static void main(String[] args) {
	Greet G=new Way_Of_Greet(); //  Runtime Polymorphism Example
	Pen P=new Fountain_Pen(); //  Runtime Polymorphism Example
	Telephone T=new SmartPhone(); //  Runtime Polymorphism Example
	SmartPhone S=new SmartPhone();
	// Way-Of_Greet H=new Way_Of_Greet(); //  **It is also Possible***
	G.Muslims();
	G.Hindus();
	G.Christians();
	G.Jesus();
	P.Write();
	P.Refill();
	P.InkSpace();
	P.ChangeNib();
	T.lift();
	T.disconnect();
	T.ring();
	S.Camera();
	S.Browser();
}
}
 