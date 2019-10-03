package sychnonizedobjectlevellock;

public class BaseClass extends Thread
{
	String msg;
	Hello h;
	public BaseClass(String msg, Hello h) {
		
		this.msg = msg;
		this.h = h;
	}
	public void run()
	{
		h.display(msg);
	}
}
