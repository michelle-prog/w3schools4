class OuterClass{
	int x = 10;

	class InnerClass{
	public int myInnerMethod(){
	return x;
	}
	}
}

public class MyMainClass2{
	public static void main(String[] args){
	OuterClass myOuter = new OuterClass();
	OuterClass.InnerClass myInner = myOuter . newInnerClass();
	System.out.println(myInner.myInnerMethod());
	}
}