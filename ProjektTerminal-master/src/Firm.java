import java.io.Serializable;
import java.util.*;

public abstract class Firm  implements  Serializable{

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
	

	public void callAutorization(Card card,FirmAccount firmAccount,double amount,Center center) {
		
		
		boolean result= center.autorize(card, firmAccount, amount);
		if (result ==true)
			System.out.println("transakcja potwierdzona");
		else 
			System.out.println("transakcja odrzuona");
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
