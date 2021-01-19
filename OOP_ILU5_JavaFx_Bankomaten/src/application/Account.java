/**
 * 
 */
package application;

/**
 * @author Julio_Cesar Oliva_Herrera
 *
 */
public class Account {
	
	// TODO
	private int id;  
    private double balance; 
    private static double annualInterestRate = 0; 
    private final java.util.Date dateCreated; 
    
    public Account() 
    {
        dateCreated = new java.util.Date();
    }
    
    /**
     * Constructor which takes in account number and balance as parameters.
     * @param newId
     * @param newBalance
     */
    public Account(int newId, double newBalance)  
    { 
        id = newId; 
        balance = newBalance;
        dateCreated = new java.util.Date();
    }
    
    /**
     * Getter function which returns account id.
     * @return
     */
    public int getId() 
    { 
        return id;
    }
    
    /**
     * Getter function to obtain account balance.
     * @return
     */
    public double getBalance() 
    { 
        return balance;
    }
    
    // TODO
    public static double getAnnualInterestRate() 
    { 
        return annualInterestRate;

    }
    
    public void setId(int newId) 
    { 
        id = newId;
    }
    
    /**
     * Set function to set account id.
     * @param newBalance
     */
    public void setBalance(double newBalance)   
    { 
        balance = newBalance;
    }
    
    public static void setAnnualInterestRate(double newAnnualInterestRate) 
    {

        annualInterestRate = newAnnualInterestRate;
    }
    
    public double getMonthlyInterest() 
    {   
        return balance * (annualInterestRate / 1200);
    }
    
    /**
     * This function returns the date of account creation.
     * @return
     */
    public java.util.Date getDateCreated() 
    { 
        return dateCreated;
    }
    
    /**
     * This function is used to withdraw amount and reduce the balance.
     * @param amount
     */
    public void withdraw(double amount) 
    { 
        balance -= amount;
    }
    
    /**
     * This function is used to deposit money and increase the balance.
     * @param amount
     */
    public void deposit(double amount)  
    { 
        balance += amount;
    }

}
