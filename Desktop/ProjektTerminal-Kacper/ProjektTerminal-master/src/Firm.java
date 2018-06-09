import java.io.Serializable;
import java.util.*;

public abstract class Firm  implements  Serializable{

	Firm() throws EmptyConstructorException
	{
		try {
			throw new EmptyConstructorException("Nie tworz pustych konstruktorow");
		}
		catch(EmptyConstructorException x) {
			System.out.println(x.getMessage());
		}
	}
	Firm(String firmName) throws WrongArgumentException{
		try {
			if(firmName instanceof String==true)
			this.firmName=firmName;
			else throw new WrongArgumentException("Zly parametr");
		}
		catch(WrongArgumentException c) {
			System.out.println(c.getMessage());
		}
		}
	
	private String firmName;
	
	

	private LinkedList<Bank> bankList = new LinkedList<Bank>();
	private LinkedList<FirmAccount> firmAccountsList = new LinkedList<FirmAccount>();
	
	public String getFirmName() {
		return firmName;
	}
	

	public void callAutorization(Card card,FirmAccount firmAccount,double amount,Center center) throws WrongArgumentException {
		
		
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
