abstract class Person2{
	public String fname = "John";
	public int age = 24;
	public abstract void study();
}

class Student extends Person2{
	public int graduationYear = 2018;
	public void study(){
	System.out.println("Studying all day long");
	}
}

class MyClass9{
	public static void main(String[] args){
	Student myObj = new Student();

	System.out.println("Name: " + myObj.fname);
	System.out.println("Age: " + myObj.age);
	System.out.println("Graduation Year: " + myObj.graduationYear);
	myObj.study();
	}
}