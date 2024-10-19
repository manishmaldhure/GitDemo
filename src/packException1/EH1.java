package packException1;

public class EH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int n=10/0;
		System.out.println(n);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block executed..");
		}
		
		
		
		
		
		
		/*	int n;
		String s="Selenium";
		try {
		 n=Integer.parseInt(s);
		 System.out.println(n);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("Exception handled..");
		
		
		String s=null;
		
		try {
		System.out.println(s.length());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Exception handled..");
		
			try {
		int i=50/0;
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		System.out.println("Exception handled..");
	*/	
	}

}
