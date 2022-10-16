import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Account 
{ 
	JFrame j1=new JFrame();
    private double balance;
    private long accNum;
    private String accHolder;
     
     public Account(String name, long num)
     {
    	 accHolder = name;
         accNum = num;
         balance = 0.00;
    	 System.out.println("Account Created");
     }
     
     public void deposit(double amt)
     {
    	 balance = balance + amt;
    	 System.out.println("Amount Deposited.");
     }
     
     public void withdraw(double amt) throws BankAccountException
     {
    	 try
    	 { 
    	    if(balance >= amt)
    	    {
    		    balance = balance - amt;
        	    System.out.println("Amount Withdrawn");
    	    }
    	    else
    	    { 
    	    	throw new BankAccountException();
    		   
    	    }
    	 }
    	 catch(BankAccountException bae)
    	 {
            JOptionPane.showMessageDialog(j1, "Can Not Be WithDraw");
            System.exit(0);
         }
     }
     
     public void printBalance()
     {
    	 System.out.println("Current balance: " + balance);    	 
     }
     public double getBalance()
     {
         return balance;
     }
}

