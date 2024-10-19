package pack01;

public class Static5 {
	static int z=5; //Static variable...
	int y=1;
	
	public static void a()
	{
		int z=10;
		System.out.println(z);
	}
	public void b()
	{
		int z=15;
		System.out.println(z);
		a();
	}
	

	public static void main(String[] args) {
		
		Static5 s=new Static5();
		a();
		s.b();
		
				

	}

}
