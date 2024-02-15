package CNT4714.Project2;

//Bank Interface specifies abstract methods to define the allowed behaviors on a bank account.

public interface TheBank 
{
    //deposit arguments: deposits amount, thread name making the deposit
    public abstract void deposit();

    //withdrawl agruments: withdrawl amount, thread name making the withdrawl
    public abstract void withdrawl();

    //flagged transactions are logged independently into a log file
    //flagged transactions arguments: transaction amount, thread name making the transaction, type of thread making the transaction
    //use "D" for depositer thread type, and "W" for withdrawl thread type
    public abstract void flagged_transaction();

    //internal banking audit - examines balance only
    public abstract void internalAudit();

    //external banking audit - Treasury Dept. - examines balance only
    public abstract void treasuryAudit();

}
