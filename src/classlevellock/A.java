package classlevellock;



public class A extends Thread
{
	String msg;
	Hello h;
	public A(String msg, Hello h) {
		
		this.msg = msg;
		this.h = h;
	}
	public void run()
	{
		h.display(msg);
	}
}
