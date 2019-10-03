package classlevellock;

public class TestObject 
{
	public static void main(String[] args) 
	{
		Hello h= new Hello();
		
		A t1= new A("Java", h);
		A t2= new A("Pythan", h);
		t1.start();
		t2.start();
		Hello h1= new Hello();
		
		A t3= new A(".net", h1);
		A t4= new A("Course", h1);
		t3.start();
		t4.start();
	}
}
