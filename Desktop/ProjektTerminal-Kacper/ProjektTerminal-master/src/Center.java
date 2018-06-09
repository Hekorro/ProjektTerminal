
import java.io.Serializable;
import java.util.*;

public class Center implements Serializable  {

	Center(){}
	
	private ArrayList<Bank> bankList = new ArrayList<Bank>(9);
	private LinkedList<LogData> logDataList = new LinkedList<LogData>();
	private LinkedList<Firm> firmList = new LinkedList<Firm>();
	private int  bankSerialNumber=1;
	

	public int getBankSerialNumber() {
		return bankSerialNumber;
	}

	public void addBank(Bank bank) {
		bankList.add(bank);
		bankSerialNumber++;
	}
	public void addFirm(Firm firm) {
		firmList.add(firm);
	}
	public void addToLogBase(LogData logData) {
		logDataList.add(logData);
		
	}
	public void deleteBank(Bank bank) throws AlreadyDeletedException {
		try {
		if(bank!=null)
		{
		bankList.remove(bank);
		bank=null;
		}
		else throw new AlreadyDeletedException("Bank zostal juz usuniety");
		}
		catch(AlreadyDeletedException a) {
			System.out.println(a.getMessage());
		}
	
	}
	public void deleteFirm(Firm firm) throws AlreadyDeletedException {
		try {
		if(firm!=null) {
		firmList.remove(firm);
		firm=null;
		}
		else
			throw new AlreadyDeletedException("Firm zostala juz usunieta");
		}
		catch(AlreadyDeletedException b) {
			System.out.println(b.getMessage());
		}
	}
	public ArrayList<Bank> getBanks(){
		return bankList;
	}
	public LinkedList<LogData> getLogData(){
		return logDataList;
	}
	//autorize do przerobienia
	
	public boolean autorize(Card card,FirmAccount firmAccount,double amount) throws WrongArgumentException {
		Bank bankToAutorize = card.getBank();
		LogData result = bankToAutorize.confirmAutorization(card, firmAccount, amount);
		logDataList.add(result);
		if (result.getResult()=="zautoryzowano")
		{
			return true;
		}
		else
		{
			return false;
		}
		}
	public void search(LogData logData, String string) {}
	public void browseBank() {
		for(Bank bank:bankList)
		{
			System.out.println(bank.getBankName());
		}
	}
	public void browseFirm() {
		{
			for(Firm firm:firmList)
			{
				System.out.println(firm.getFirmName());
			}
		}
	}
	
}
