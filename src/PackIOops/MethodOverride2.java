package PackIOops;

public class MethodOverride2 extends MethodOverride1{

	
	public void eat()
	{
		System.out.println("you are eating..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverride1 m2=new MethodOverride2();
				m2.eat();
			//	m2.run();
	}
	public void run()
	{
		System.out.println("you are running....");
	}

}
