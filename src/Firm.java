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
		LogData logData=center.autorize(card, firmAccount, amount);
		center.addToLogBase(logData);
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
