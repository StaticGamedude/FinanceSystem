import java.util.Date;

public class CreditTransaction 
{
	static private long ID = 0;
	private CreditType creditType;
	private long amount;
	private String description;
	private Account account;
	private PaymentType payment;
	private Date date;
	
	public CreditTransaction(CreditType creditType, long amount, String description, Account account, PaymentType payment, Date date)
	{
		this.creditType = creditType;
		this.amount = amount;
		this.description = description;
		this.account = account;
		this.payment = payment;
		this.date = date;
	}
	
	public CreditType GetCreditType()
	{
		return creditType;
	}
	
	public void SetCreditType(CreditType creditType)
	{
		this.creditType = creditType;
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
