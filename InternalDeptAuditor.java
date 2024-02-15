//Auditor thread's run method simply checks and reports the accounts current balance.


package CNT4714.Project2;

import java.util.Random;

public class InternalDeptAuditor implements Runnable 
{
    // add variables and constants as needed


    //constructor
    public InternalDeptAuditor()
    {
        //create a InternalDeptAuditor instance
    
    }// end Auditor constructor


    public void run()
    {
        while(true)
        {
            try     /*run the instance in an infinite loop */
            {
                //sleep
                //run audit
            }   //end try
            catch (Exception e)
            {
                System.out.println("Exception thrown by InternalDeptAuditor!");
            }//end catch

        }//end while

    }//end run

}   //end class InternalDeptAuditor
