package reference;

public class referencedemo 
{
	public static void main(String[] args) 
	{
	System.out.println("hii this is for you");
	JobInter jobinter=Staff::bigstaff;
	jobinter.doback();

	Runnable runnable=Staff::threadwork;
	Thread thread1=new Thread(runnable);
	thread1.start();
	
	Staff st=new Staff();
	Runnable rs=st::threadcoach;
	Thread th=new Thread(rs);
	th.start();
	}
}
