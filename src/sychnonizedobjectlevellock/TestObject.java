package sychnonizedobjectlevellock;

public class TestObject 
{
	public static void main(String[] args) 
	{
		Hello h= new Hello();
		
		BaseClass t1= new BaseClass("Java", h);
		BaseClass t2= new BaseClass("Class", h);
		t1.start();
		t2.start();
Hello h1= new Hello();
		
		BaseClass t3= new BaseClass(".net", h1);
		BaseClass t4= new BaseClass("Course", h1);
		t3.start();
		t4.start();
	}
}
