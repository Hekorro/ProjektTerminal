
import java.util.*;

public class Center {

	Center(){}
	
	private ArrayList<Bank> bankList = new ArrayList<Bank>(9);
	private LinkedList<Date> logDataList = new LinkedList<Date>();
	private LinkedList<Firm> firmList = new LinkedList<Firm>();
	int bankSerialNumber=1;
	
	
	
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
	public void addToLogBase(Card card, double amount, Date date) {}
	public void deleteBank(Bank bank) {
		bankList.remove(bank);
		bank=null;
	}
	public void deleteFirm(Firm firm) {
		firmList.remove(firm);
		firm=null;
	}
	public ArrayList<Bank> getBanks(){
		return bankList;
	}
	public List<Date> getLogData(){
		return logDataList;
	}
	//autorize do przerobienia
	public boolean autorize(Card card, double amount) {
		Bank bankToAutorize = card.getBank();
		return bankToAutorize.confirmAutorization(card, amount);
	}
	public boolean autorize(Card card,FirmAccount firmAccount,double amount) {
		Bank bankToAutorize = card.getBank();
		return bankToAutorize.confirmAutorization(card, firmAccount, amount);
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
