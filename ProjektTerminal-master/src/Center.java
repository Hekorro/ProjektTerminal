
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
	public LinkedList<LogData> getLogData(){
		return logDataList;
	}
	//autorize do przerobienia
	
	public boolean autorize(Card card,FirmAccount firmAccount,double amount) {
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
	public void search(String firm, String bank, int cardNumber, String ownerFirstName, String ownerLastName, double amount,boolean How) {
		LogData log =  new LogData(firm, bank, cardNumber, ownerFirstName, ownerLastName, amount);
		LinkedList<LogData> logDataListTemp = new LinkedList<LogData>();
		logDataListTemp=logDataList;
		if (How==true)
		{
			 for (LogData x:logDataListTemp)
			 {
				 //System.out.println(x.toString()); 
				 boolean ok = false;
				
				 if (log.getFirm().equalsIgnoreCase(x.getFirm()))
				 {
					 ok= true;
				 }
				 if (log.getBank().equalsIgnoreCase(x.getBank()))
				 {
					 
					 ok= true;
				 }
				 if (log.getCardNumber()==x.getCardNumber())
				 {
					 
					 ok= true;
				 }
				 if (log.getOwnerFirstName().equalsIgnoreCase(x.getOwnerFirstName()))
				 {
					 
					 ok= true;
				 }
				 if (log.getOwnerLastName().equalsIgnoreCase(x.getOwnerLastName()))
				 {
					 
					 ok= true;
				 }
				 if (log.getAmount()==x.getAmount())
				 {
					 
					 ok= true;
				 }
				 if (ok==true)
					 System.out.println(x.toString());
					 
			 }
		}
				 
				 else {
					 System.out.println("elo");
					 for (LogData y:logDataListTemp)
					 {
						boolean ok = true;
						if (log.getFirm()!="" )
							 if(!log.getFirm().equalsIgnoreCase(y.getFirm()) )
						 {
								ok=false;
							
						 }
						 if ( log.getBank()!="" )
							 if(!log.getBank().equalsIgnoreCase(y.getBank()) )
						 {
							ok=false;
							}
						 if (log.getCardNumber()!=0)
							 if(log.getCardNumber()!=y.getCardNumber())
						 {
							
							ok=false;	
						 }
						 if (log.getOwnerFirstName()!="")
							 if(!log.getOwnerFirstName().equalsIgnoreCase(y.getOwnerFirstName()))
						 {
							 
							 ok=false;
							 
						 }
						 if (log.getOwnerLastName()!="")
							 if(!log.getOwnerLastName().equalsIgnoreCase(y.getOwnerLastName()))
						 {
							ok=false;
						 }
						 if (log.getAmount()!=0.0)
							 if(log.getAmount()!=y.getAmount())
						 {
							 ok=false; 
						 }
						 	if (ok==true)
						System.out.println(y.toString());					 
					 }
					 }
					
					
					 
				 	
	}
	
			 	
			
	
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
