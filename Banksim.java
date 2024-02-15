package CNT4714.Project2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Banksim 
{
    //10 withdrawl agents, 5 deposit agents, and 2 auditor agents
    public static final int MAX_AGENTS = 17;
    
    public static void main( String[] args )
    {
        ExecutorService application = Executors.newFixedThreadPool( MAX_AGENTS ); //executor object

        BankAccount jointAccount = new BankAccount(); // creates Bank account to work with
        try 
        { 
            System.out.println("***     Simulation Begins...");
            System.out.println();

            System.out.println("Deposit Agents\t\t\t     Withdrawal Agents\t\t       Balance                                  Transaction Number");
            System.out.println("--------------\t\t\t     -----------------\t\t------------------------\t\t\t------------------");

            //start all threads running
            application.execute(new Withdrawl( jointAccount, "Agent WT3"));
            application.execute(new Depositer(jointAccount, "Agent DT3"));
        }//end try block

        catch ( Exception exception )
        {
            exception.printStackTrace();    //Something went wrong
        }//end catch block

        application.shutdown();


    }

}
