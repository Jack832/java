import java.util.*;
class th implements Runnable 
{
char b[]={'h','e','l','l','o'}; 		
		public void run()
		{
		for(int i=0;i<5;i++)
		{
		    try{
		    System.out.print(b[i]);
	            Thread.sleep(1000);                   
		    }
		  	catch(Exception ce)
		  	{   		
		  	System.out.println(ce);
		  	}
		}
		}
			public static void main(String arg[])
			{
			th kk= new th();
			Thread t=new Thread(kk);
			t.start();
			}
}


