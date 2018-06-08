import java.util.*;

public abstract class Firm {

	Firm(){}
	Firm(String firmName){
		this.firmName=firmName;
	}
	
	private String firmName;
	
	

	private LinkedList<Bank> bankList = new LinkedList<Bank>();
	private LinkedList<FirmAccount> firmAccountsList = new LinkedList<FirmAccount>();
	
	public String getFirmName() {
		return firmName;
	}
	

	public boolean callAutorization(Card card,FirmAccount firmAccount,double amount,Center center) {
		return center.autorize(card, firmAccount, amount);
	}
	public List<Bank> getBanks()
	{
		return bankList;
	}
	public List<FirmAccount> getFirmAccount()
	{
		return firmAccountsList;
	}
	
}
