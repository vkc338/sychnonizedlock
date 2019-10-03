package threadyieldmethod;

public class Consume extends Thread
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
	      {
	         System.out.println("I am Consumer : Consume Item " + i);
	         Thread.yield();
	      }
	}
}
