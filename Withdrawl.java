//Withdrawl thread's run method removes money from the bank account


package CNT4714.Project2;

import java.util.Random;

public class Withdrawl implements Runnable
{
    //define class variables and constants as needed
    private static final int MAX_WITHDRAWL = 99;
    private static final int MAXSLEEPTIME = 1500;

    //constructor
    public Withdrawl()
    {
        //create a withdrawl instance

    }   //end withdrawl constructor

    public void run()
    {
        while(true) //run withdrawl in infinite loop 
        {
            try     /**sleep random time for simulation, then withdrawl money**/
            {
                Thread.sleep(sleeptime.nextInt(MAXSLEEPTIME-1+1)+1);  //sleep thread - was 1500
                //sleep random time
                //withdrawl money

            }   //end try
            catch (Exception e)
            {
                System.out.println("Exception thrown withdrawling!");
            }//end catch

        }    //end while

    }//end run

}    //end class Withdrawl

