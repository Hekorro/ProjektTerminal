
import java.util.*;

public class Center {

	Center(){}
	
	private LinkedList<Bank> bankList = new LinkedList<Bank>();
	private LinkedList<Date> logDataList = new LinkedList<Date>();
	private LinkedList<Firm> firmList = new LinkedList<Firm>();
	
	public void addBank(String bankName) {
		Bank bank=new Bank(bankName);
		bankList.add(bank);
	}
	public void addFirm(String firmName) {
		Firm firm = new Firm(firmName);
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
	public List<Bank> getBanks(){
		return bankList;
	}
	public List<Date> getLogData(){
		return logDataList;
	}
	//autorize do przerobienia
	public boolean autorize(Card card, double amount) {
		return true;
	}
	public boolean autorize(FirmAccount firmAccount,double amount) {
		return true;
	}
	public void search(LogData logData, String string) {}
	public void browseBank() {}
	public void browseFirm() {}
	
}
