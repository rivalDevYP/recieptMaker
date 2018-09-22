	package modern;
	
	//import java.util.*;
	import javax.swing.*;
	
	public class modern 
	{
		public static void main (String[]args)
		{
			int itemCount=itemCounter();
			float subTotal=getInfo(itemCount);			
			float total=printTotal(subTotal);
			payMethod(total);
		}		
		private static int itemCounter()
		{
			int itemCount=Integer.parseInt(JOptionPane.showInputDialog("How many items do you have? "));
			System.out.println("You have "+itemCount+" items...\n");
			return itemCount;
		}
		private static float getInfo (int itemCount)
		{
			float subTotal = 0;			
			for (int index=1;index<(itemCount+1);index++)
			{
				float itemPrice=Float.parseFloat(JOptionPane.showInputDialog("Please enter price of item "+index));
				System.out.println("Iteration "+index+" complete...Price entered: "+itemPrice);
				subTotal=subTotal+itemPrice;	
			}
			return subTotal;
		}
		private static float printTotal (float subTotal)
		{
			float tax = 0;	
			float total=0;
			
			JOptionPane.showMessageDialog(null,"Your subtotal is: $"+subTotal);
			System.out.println("All item prices added together: "+subTotal);
			tax=((subTotal/100)*13);
			JOptionPane.showMessageDialog(null,"\nTax = $"+tax);
			System.out.println("The tax of the subtotal is: "+tax);
			total=tax+subTotal;
			JOptionPane.showMessageDialog(null,"\nYour total is: $"+total);
			System.out.println("subtotal plus added taxes: "+total);
			return total;
		}
		private static void payMethod (float total) 
		{
			float money=Float.parseFloat(JOptionPane.showInputDialog(null,"Are you paying by cash? Enter how much you are paying..."));
			float change=money-total;
			if (change<0)
			{
				JOptionPane.showMessageDialog(null, "Sorry, that's not enough! You need $"+(0-change)+" more");
			}
			else {
			JOptionPane.showMessageDialog(null, "Your change is: $"+change);
			}
		}
	}
	
