//Multithread java code to  do multiple task ->(1) print integer value (2) print alphabet A to Z
package com.code;
class Num extends Thread 
{
	//run method of this class is responsible for printing  integer values
	@Override
	public void run()
	{
		try {
				for(int i=1;i<=30;i++)
				{
					System.out.println(i);
					Thread.sleep(1000);
				}
		}
		catch(InterruptedException e)
		{}
	}
}
class Alpha extends Thread 
{
	//run method of this class is responsible for printing alphabet characters
	@Override
	public void run() 
	{
		char[] arr=new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		try 
		{
			for(int i=0;i<=26;i++)
			{
				System.out.println(arr[i]);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{}
	}
}
public class  ThreadProgram
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Start both threads
		Num t1=new Num();
		t1.start();
		Alpha t2=new Alpha();
		t2.start();
	}
}