package pack01;

import java.util.ArrayList;
import java.util.Iterator;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Object> obj=new ArrayList<Object>();
		obj.add(1);
		obj.add(10.7);
		obj.add("Selenium");
		obj.add(3>10);
		obj.add('a');
		
		System.out.println(obj);
		
		Iterator<Object> itr=obj.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		 
		
		/*	for(Object ob:obj)
		{
			System.out.println(ob);
		}
		
		
				
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int n=a.length;
		System.out.println(n);
		
		int r=a[0].length;
		System.out.println(r);
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		
	int b[]= {0,1,3,5,8,13};
		String s[]= {"Selenium","APPIUM","APIAUTO","Hi","Hello"};
		Object obj[]= {1,2.5,'s',"ABC",10.5};
		System.out.println(b.length);
		System.out.println(s.length);
		System.out.println(obj.length);
		
		System.out.println(s[0]);
		s[0]="Automation";
		System.out.println(s[0]);
		
		System.out.println();
		int a[]=new int[5];
		System.out.println(a.length);
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
		int count=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
				{
					
					count++;
					break;
				}
				
				System.out.println(i+"  "+j);
			}
			
			System.out.println("control come out of inner loop..");
		}
		System.out.println(count);
		
		
		
		
		
			
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				break;
			}
		
			
			System.out.println(i);
			//i++;
		}
		
		
		
	
		double b=10.5;
		int a=(int)b;
		System.out.println(a);
		System.out.println(b);
		
		//String to integer conversion
		
		String s="5";
		
		int n=Integer.parseInt(s);
		System.out.println(n);
		
		int c=30;
		double d=c;
		System.out.println(d);
		
		
		// integer to String conversion
		
		int x=10;
		String str=String.valueOf(x);
		
		System.out.println(str);
		int res=x+n;
		System.out.println(res);
		
		
		
		
		
		
			
		while(i<20&&i>9)
		{
			System.out.println(i);
			i++;
		}
		
		
		
		
		Object a[]= {1,3,5,'a','c','e',"Shyam","Krishna","innova",3>22};
		
		for(Object obj:a)
		{
			System.out.println(obj);
		}
		
		
		int age=5;
		int weight=55;
		
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println("allowed to blood donation..");
			}
			else
			{
				System.out.println("youa re under weight..");
			}
		}else 
		{
			System.out.println("allowed to not blood donation.");
		}
		

		int q=3000;
		int w=300;
		
		if(q>w)
		{
			System.out.println("q is greater than w");
		}
		else if(q==w)
		{
			System.out.println("q is equals to w");
			}
		else
		{
			System.out.println("q is less than w");
		}
		
		*/
		
	}

}
