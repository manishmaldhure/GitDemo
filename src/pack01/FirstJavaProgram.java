package pack01;

public class FirstJavaProgram {
	int a = 5;
	 static int c = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstJavaProgram obj=new FirstJavaProgram();
		System.out.println("Hello..");
		
		FirstJavaProgram.aMethod();
		bMethod();
		System.out.println(obj.a);
		System.out.println(c);

	}
	public static void aMethod()
	{
		System.out.println("inside the aMethod..");
	}
	
	public static void bMethod()
	{
		System.out.println("inside the bmethod..");
	}
	
	

}
