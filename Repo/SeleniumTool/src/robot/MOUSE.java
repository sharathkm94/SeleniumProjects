package robot;

import java.awt.AWTException;
import java.awt.Robot;

public class MOUSE {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		Robot r = new Robot();
		for(int i=1;i<=500;i=i+10)
		{
			r.mouseMove(200+i, 150);
			Thread.sleep(500);
		}
	}

}
