class MyThread extends Thread
{
}
class DaemonDemo
{
	public static void main(String [] args)
	{
	
	System.out.println(Thread.currentThread().isDaemon());
	//Thread.currentThread().setDaemon(true);
	MyThread t = new MyThread();
	System.out.println(t.isDaemon());
	t.setDaemon(true);
	System.out.println(t.isDaemon());
	
	}
}