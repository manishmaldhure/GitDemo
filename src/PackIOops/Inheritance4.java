package PackIOops;

public class Inheritance4 extends Inheritance3{
	
	
	public void division(float a, float b)
	{
		double div=a/b;
		System.out.println("division is .."+div);
	}
	public static void main(String[] args) {
		int x=30; int y=70;
		
		Inheritance4 i4=new Inheritance4();
		i4.Addition(x, y);
		i4.Substraction(x, y);
		i4.division(x, y);
		
	}

}
