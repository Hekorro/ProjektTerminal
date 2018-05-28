
import java.util.*;

public class Center {

	Center(){}
	
	private LinkedList<Bank> bankList = new LinkedList<Bank>();
	private LinkedList<LogData> logDataList = new LinkedList<LogData>();
	private LinkedList<Firm> firmList = new LinkedList<Firm>();
	
	public void addBank(String name) {
		Bank bank = new Bank(name); 
				bankList.add(bank); 
		}
	public void addFirm(String name) {
		Firm firm = new Firm(name);
		firmList.add(firm);
		}
	public void addToLogBase(Card card, double amount, Date date, Firm firm) {
		LogData log=new LogData(card, amount, date, firm);
		logDataList.add(log);
	}
	public void deleteBank(Bank bank) {}
	public void deleteFirm(Firm firm) {}
	public List<Bank> getBanks(){
		return bankList;
	}
	public List<LogData> getLogData(){
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
