package CNT4714.Project2;

import java.util.Random;

public class Depositer implements Runnable
{
    //define class variables and constants as needed
    private static final int MAX_DEPOSIT = 500;
    private static final int MAXSLEEPTIME = 1500;



    //constructor
    public Depositer()
    {
        //create a depositer instance
    }   //end Depositer constructor


    //add money to the bank account
    public void run()
    {
        while(true) //run depositer in infinite loop 
        {
            try     /**sleep random time for simulation, then add money**/
            {
                Thread.sleep(sleeptime.nextInt(MAXSLEEPTIME-1+1)+1);  //sleep thread - was 1500
                //add money to the bank account
            }   //end try
            catch (InterruptedException exception)
            {
                System.out.println("Exception thrown depositing!");
            }//end catch
        }    //end while

    }//end run

}    //end class Depositer
