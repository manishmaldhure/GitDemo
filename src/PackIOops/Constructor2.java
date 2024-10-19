package PackIOops;

public class Constructor2 {
	int no;
	String name;

	public Constructor2() {
		System.out.println("default constructor..");
	}

	public Constructor2(int i, String s) {
		this.no=i;
		this.name=s;
		
	}
	public void display()
	{
		System.out.println("No is.."+no+"  "+"Name is  "+name);
	}

	public static void main(String[] args) {

		Constructor2 c1=new Constructor2();
		Constructor2 c2=new Constructor2(1,"Shyam");
		c2.display();
		c1.display();

	}

}
