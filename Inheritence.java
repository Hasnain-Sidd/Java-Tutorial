class  Quadrilateral{
	double s1,s2,s3,s4;
	public Quadrilateral(double s1,double s2,double s3,double s4) {
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
		System.out.println("The Area Of Quadrilateral :"+s1*s2*s3*s4);
	}

	}
class Square {
	double side1;
	public Square(double side1){
		
		this.side1=side1;
		System.out.println("Area OF Square :"+side1*side1);
	}
	
}
class Rectangular extends Quadrilateral{
	public Rectangular(double sides1,double sides2,double sides3,double sides4) {
		super(sides1,sides2,sides3,sides4);
		System.out.println("Area Of Rectangler :"+sides1*sides2);
	}
	
	
}
public class Inheritence {
public static void main(String[] args) {
	Rectangular R1=new Rectangular(5,6,3,1);
	Square S1=new Square(6);

}
}
