package hw05_Enes_KILICASLAN;

import java.util.ArrayList;

/**
 *
 * @author eneskilicaslan
 */
public class Main 
{

    /**
     *
     * @param Args
     */
    public static void main(String[] Args)
	{
		
		
		
		System.out.println("**************************** TOWER OF HANOI  ************************************");
		System.out.println();
		
		TowersOfHanoiIterative hanoi = new TowersOfHanoiIterative(7);
		
		System.out.println("Before Operation");
		System.out.printf("Source Stack: %s\n", hanoi.getSource());
		System.out.printf("Destination Stack: %s\n", hanoi.getDestination());

		hanoi.doIterative(7,"S", "D", "A");
		
		System.out.println("After Operation");
		System.out.printf("Source Stack: %s\n", hanoi.getSource());		
		System.out.printf("Destination Stack: %s\n", hanoi.getDestination());		
		

		
		
	}

}
