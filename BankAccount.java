package CNT4714.Project2;
import java.io.IOException;

import java.util.concurrent.locks.Lock;

public class BankAccount implements TheBank
{
    //Define the lock to control mutually exclusive access to the bank account

    //Define any condition for this lock

    //Define the variables and constants for the bank account


    public void flagged_transaction()
    {
        //generate a Date object for timestamping
        //set the Date object format
        //create a StringBuilder object
        //create an ouput transaction file

        try
        {
            //set the transaction file pointer
            //set up a PrintWriter object
            //create the timestamp
            if (transaction type is a depositer) //output for a flagged deposit transaction
            {

            }
            else    //transaction type is a withdrawl
            {

            }
            //write the string to the transaction file
        }//end try block

        catch(IOException ioException)
        {
            System.out.println("\nError: Problem writing to transaction file.\n");
        }//end catch block

        finally
        {
            //close the file writer
        }//end finally block

    }//end method flagged_transaction


    //method used to make a deposit into the bank account

    public void deposit()
    {
        //lock the bankaccount
        //wait for auditor to complete
        //output thread information, deposit amount and account balance, then signal any waiting withdrawl threads

        try
        {
            //make deposit

            //handle transaction logging for flagged transaction

            //signal all waiting withdrawl threads waiting to make a withdrawl

        }//end try block

        catch(Exception e)
        {
            System.out.println("Exception thrown depositing");
        }// end catch block 
        
        finally
        {
            //unlock the bank account
        }// end finally block
        
    }// end method deposit


    //method to make withdrawls

    public void withdrawl()
    {
        //lock the bankaccount
        //wait for auditor to complete
        //output thread information, withdrawal amount and account balance, then signal any waiting withdrawl threads

        try
        {
            //check balance
            //if balance is too low
                //block for deposit to occur
            //else
                //make withdrawl
                //handle transaction logging for flagged transaction


        }//end try block

        catch(Exception e)
        {
            System.out.println("Exception thrown getting the withdrawl");
        }// end catch block 
        
        finally
        {
            //unlock the bank account
        }// end finally block
        
    }// end method withdrawl  


    //method to make an audit of the bank account

    public void internalAudit()
    {
        //lock the bank account
        //wait fo auditor to complete
        //output thread information, account balance.

        try 
        {
            //run audit
            //signal all waiting to complete
        }   //end try block

        catch (Exception e)
        {
            System.out.println("An exception was thrown getting the balance by the Auditor.");
        }//end catch block

        finally 
        {
            //unlock the bank account
        }//end finally block

    }//end method internalAudit

    public void treasuryAudit()
    {
        //lock the bank account
        //wait for auditor to complete
        //output thread infromation, account balance.
    
        try
        {
            //run audit
            //signal all waiting for audit to complete
        }   //end try block

        catch (Exception e)
        {
            System.out.println("An exception was thrown getting the balance by the Auditor.");
        }//end catch block

        finally
        {
            //unlock the bank account
        }   //end finally block
    }// end method treasuryAudit

}
