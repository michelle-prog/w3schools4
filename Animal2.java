abstract class Animal2{
	public abstract void animalSound();
	public void sleep(){
	System.out.println("Zzz");
	}
}

class Pig extends Animal2{
	public void animalSound(){
	System.out.println("The pig says: wee wee");
	}
}
class MyMainClass3{
	public static void main(String[] args){
	Pig myPig = new Pig();
	myPig.animalSound();
	myPig.sleep();
	}
}