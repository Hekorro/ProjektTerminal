import java.io.Serializable;

//zastanowic sie jak w klasie Card i FirmACCOUNT ogarnac zmienna bank ("zaimportowac")
public class FirmAccount implements  Serializable {

	private Firm firm;
	private double balance;
	private Bank bank; // ???
	private int accountNumber;
	
	
	FirmAccount() throws EmptyConstructorException
	{
		try {
			throw new EmptyConstructorException("Nie tworz pustych konstruktorow");
		}
		catch(EmptyConstructorException x) {
			System.out.println(x.getMessage());
		}
	}


	FirmAccount(Firm firm, Bank bank) throws WrongArgumentException{
			try {
			if(firm instanceof Firm==true && bank instanceof Bank==true)
			{
			int x=bank.getSerialNumber();
			int y=bank.getCardNumber();
			int z=x*10000;
			this.accountNumber=z+y;
			this.balance=0;
			this.firm = firm;
			this.bank=bank;
			}
			else throw new WrongArgumentException("Zly argument/argumenty");
			}
			catch(WrongArgumentException d) {
				System.out.println(d.getMessage());
			}
	}

	public double getBalance() {
		return balance;
	}
	public Firm getFirm(){
		return this.firm;
	}
	public Bank getBank() {
		return this.bank;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void payIn(Double amount) throws WrongArgumentException {
		try {
			if(amount>0 && amount instanceof Double==true)
			this.balance = this.balance + amount;
		else throw new WrongArgumentException("Zly argument");
		}
		catch(WrongArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		}
	
	
}
