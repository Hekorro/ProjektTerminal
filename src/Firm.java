import java.util.*;

public class Firm {

	
	Firm(){}
	Firm(String firmName){
		this.firmName=firmName;
	}
	
	private String firmName;
	
	private LinkedList<Bank> bankList = new LinkedList<Bank>();
	private LinkedList<FirmAccount> firmAccountsList = new LinkedList<FirmAccount>();
	public String getFirmName()
	{
		return firmName;
	}
	public void callAutorization(Card card, double amount) {
	}
	public void callAutorization(FirmAccount firmAccount) {
	}
	public LinkedList<Bank> getBanks()
	{
		return bankList;
	}
	public LinkedList<FirmAccount> getFirmAccount()
	{
		return firmAccountsList;
	}
	
}
