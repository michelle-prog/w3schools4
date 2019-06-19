public class Car2{
	int modelYear;
	String modelName;

	public Car2(int year,String name){
	modelYear = year;
	modelName = name;
	}
	public static void main(String[] args){
	Car2 myCar2 = new Car2(1969, "Mustang");
	System.out.println(myCar2.modelYear + " " + myCar2.modelName);
	}
}