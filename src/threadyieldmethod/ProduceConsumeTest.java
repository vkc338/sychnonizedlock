package threadyieldmethod;

public class ProduceConsumeTest 
{
	public static void main(String[] args) 
	{
		Produce p= new Produce();
		Consume c= new Consume();
		p.setPriority(Thread.MIN_PRIORITY);
		c.setPriority(Thread.MAX_PRIORITY);
		p.start();
		c.start();
	}
}
