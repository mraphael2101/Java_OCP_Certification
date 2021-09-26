package _10_threads;

public class _01_ThreadSleepExample
{
	public static void main(String [] args)
	{
		TestSleepExtendingThread t1 = new TestSleepExtendingThread();
		TestSleepExtendingThread t2 = new TestSleepExtendingThread();
		
		t1.start();
		t2.start();
	}
}


class TestSleepExtendingThread extends Thread
{
	public void run() 
	{
		for(int i=1; i<5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){System.out.println(e);}
			
			System.out.println(i);
		}
	}
}