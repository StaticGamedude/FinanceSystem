import java.util.ArrayList;

public class Account 
{
	private String name;
	private long amount;
	private AccountType type;
	private ArrayList<CreditTransaction> creditTransactions;
	private ArrayList<DebitTransaction> debitTransactions;
	
	public Account(String name, long amount, AccountType type)
	{
		this.name = name;
		this.amount = amount;
		this.type = type;
		creditTransactions = new ArrayList<CreditTransaction>();
	}
	
	public void AddCredit(CreditTransaction credit)
	{
		creditTransactions.add(credit);
		amount = amount - credit.GetAmount();
	}
	
	public void AddDebit(DebitTransaction debit)
	{
		debitTransactions.add(debit);
		amount = amount + debit.GetAmount();
	}
}
