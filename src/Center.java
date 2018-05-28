
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
	public void deleteBank(Bank bank) {
		LinkedList<FirmAccount> x=bank.getFirmAccount();
		
		for (FirmAccount  tmp:x)
		{
			x.remove(tmp);
		}
		LinkedList<Person> y=bank.getPersons();
		
		for(Person tmp:y)
		{
			y.remove(tmp);
		}
		LinkedList<Card> z=bank.getCards();
		for(Card tmp:z)
		{
			z.remove(tmp);
		}
	}
	
	public void deleteFirm(Firm firm) {
		LinkedList<Bank> x=firm.getBanks();
		for(Bank tmp:x)
		{
			x.remove(tmp);
		}
		LinkedList<FirmAccount> y=firm.getFirmAccount();
		for(FirmAccount tmp:y)
		{
			y.remove(tmp);
		}
	}
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
	
	
	public boolean browseBank(String nazwaBanku) {
		nazwaBanku.toLowerCase();
		int licznik=0;
		for(Bank t:bankList)
		{
			String tmp=t.getBankName().toLowerCase();
			if (nazwaBanku==tmp)
			{
				System.out.println("Znaleziono szukany bank: "+nazwaBanku );
				 licznik=1;
				return true;
			}
			}
		if (licznik !=1)
			System.out.println("Nie znaleziono banku"+ nazwaBanku);
			return false;
		
	}
	public boolean browseFirm(String nazwaFirmy) 
		{
		nazwaFirmy.toLowerCase();
		int licznik=0;
		for(Firm t:firmList)
		{
			String tmp=t.getFirmName().toLowerCase();
			if (nazwaFirmy==tmp)
			{
				System.out.println("Znaleziono szukany bank: "+nazwaFirmy );
				 licznik=1;
				return true;
			}
			}
		if (licznik !=1)
			System.out.println("Nie znaleziono banku"+ nazwaFirmy);
			return false;
		
	}
	
}
