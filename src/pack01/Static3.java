package pack01;

public class Static3 {
	
	int roll;
	String name;
	public static String college="IIT Bombay";

	 Static3(int i, String n)
	{
		
		roll=i;
		name=n;
		
	}
	 public void getResult()
	 {
		 System.out.println("Role no is  "+roll+"\n"+"  Name is  "+name+"\n"+"   College  name "+college);
	 }

}
