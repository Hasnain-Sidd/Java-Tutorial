interface BasicAnimal{
	void sleep();
	void eat();
}
class Monkey{
	public void Jump() {
		System.out.println("Monkey Jumps higher than Human");
	}
	public void Bite() {
		System.out.println("Monkey has similar property of Bite as Human");
	}
}
class Human extends Monkey implements BasicAnimal{
	public void sleep() {
		System.out.println("Human Has same property as basic animal of sleep.....");
	}
	public void eat() {
		System.out.println("Human  can eat as well...........");
	}
}
public class Interface {
	public static  void main(String[] args) {
	BasicAnimal Ba=new Human(); // Run Time Polymorphism 
	Monkey  H=new Human(); // Run Time Polymorphism 
	//Human HU =new Human();
		Ba.sleep();
		Ba.eat();
		H.Jump();
		H.Bite();
	}

}
