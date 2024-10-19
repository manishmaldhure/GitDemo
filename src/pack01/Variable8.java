package pack01;

public class Variable8 {
	
	int b=10;
	static int c=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=300;
		int b=300;
		
		if(a!=b)
		{
			System.out.println("a is not equal  to b");
		}else
		{
			System.out.println("a is  equal to b");
		}
		
		
		String p="HELLO";
		String q="hello";
		
		if(p==q)
		{
			System.out.println("p is equal to q");
					}
		else
		{
			System.out.println("p is not equal to q");
		}
		
		
		if(p.equals(q))
		{
			System.out.println("p is equal to q");
					}
		else
		{
			System.out.println("p is not equal to q");
		}
		
		if(p.equalsIgnoreCase(q))
		{
			System.out.println("p is equal to q");
					}
		else
		{
			System.out.println("p is not equal to q");
		}
		
		
		
		
		
		/*	
		//char a = 0;
		char b='a';
		
		String c="abc";
		
		String str="Hello Selenium";
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(str);
		System.out.println(str.length());
		
		
		

		int a=6;
		System.out.println(a);
				
		System.out.println(c);
		d();
		
		
		Variable8 v=new Variable8();
		System.out.println(v.b);
		Variable8.d();
		v.f();
		
		*/
		
	}
	public static void d()
	{
		System.out.println();
		int e=15;
		System.out.println(e);
		System.out.println("inside the d..");
	}
	
	public void f()
	{
		System.out.println();
		int g=5;
		System.out.println(g);
	}
	
	

}
