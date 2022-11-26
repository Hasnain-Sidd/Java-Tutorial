import java.util.Scanner;
class Figure{
	double r,a,v;
	double Pi=3.14;
	public void DisplayArea(){
		
		double a=Pi*r*r;
		System.out.println("Area OF Circle :"+a);
		
	}
	public void DisplayVolume() {
		double Pi=3.14;
		double v=(4*Pi*r*r*r)/3;
		System.out.println("Volume Of Circle :"+v);
	}
}
class  Cone extends Figure{
	double h,s;
	public void CalculateArea() {
		a=Pi*r*s+Pi*r*r;
		System.out.println("Area Of  Cone:"+a);
	}
	public void CalculateVolume() {
		v=(Pi*r*r*h)/3;
		System.out.println("Volume Of Cone:"+v);
	}
}
public class Inheritence2 {
public  static void main(String[] args) {
	Cone C=new Cone();
	C.r=7;
	C.h=5;
	C.s=8;


	C.DisplayArea();
	C.DisplayVolume();
	C.CalculateArea();
	C.CalculateVolume();
}
}
