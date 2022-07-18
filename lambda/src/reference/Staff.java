package reference;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Staff 
{
public static void bigstaff() 
{
System.out.println("match to the column");	
LocalDateTime now= LocalDateTime.now();
System.out.println(now.toString());
}
public static void threadwork()
{
for(int a=1;a<=10;a++)	
{
System.out.println(a*2);	
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
public void threadcoach()
{
for(int c=1;c<=10;c++)	
{
System.out.println(c);	
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
}