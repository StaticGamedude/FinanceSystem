import java.util.Date;

public class DebitTransaction 
{
	static private long ID = 0;
	private DebitType debitType;
	private long amount;
	private String description;
	private Account account;
	private PaymentType payment;
	private Date date;
	
	public DebitTransaction(DebitType debitType, long amount, String description, Account account, PaymentType payment, Date date)
	{
		this.debitType = debitType;
		this.amount = amount;
		this.description = description;
		this.account = account;
		this.payment = payment;
		this.date = date;
	}
	
	public DebitType GetCreditType()
	{
		return debitType;
	}
	
	public void SetCreditType(DebitType debitType)
	{
		this.debitType = debitType;
	}
	
	public long GetAmount()
	{
		return amount;
	}
	
	public void SetAmount(long amount)
	{
		this.amount = amount;
	}
	
	public String GetDescription()
	{
		return description;
	}
	
	public void SetDescription(String description)
	{
		this.description = description;
	}
	
	public Account GetAccount()
	{
		return account;
	}
	
	public void SetAccount(Account account)
	{
		this.account = account;
	}
	
	public PaymentType  GetPaymentType()
	{
		return payment;
	}
	
	public void SetPaymentType(PaymentType payment)
	{
		this.payment = payment;
	}
	
	public Date GetDate()
	{
		return date;
	}
	
	public void SetDate(Date date)
	{
		this.date = date;
	}
}
