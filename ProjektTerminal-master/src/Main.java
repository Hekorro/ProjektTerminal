import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		Center center = new Center();
		Bank PKO = new Bank("PKO", center);
		center.addBank(PKO);
		Person adasko = new Person("Adam","Malysz");
		PKO.addPerson(adasko);
		Card debitCard = new Debit(adasko,PKO);
		PKO.addPersonsCard(debitCard);
		Firm firm = new Shop("Biedronka");
		center.addFirm(firm);
		FirmAccount firmAccount = new FirmAccount(firm,PKO);
		PKO.addFirmAccount(firmAccount);
		debitCard.payIn(500);
		//System.out.println(debitCard.getBalance());
		//firm.callAutorization(debitCard, firmAccount, 500, center);
		//System.out.println(debitCard.getBalance());
		//System.out.println(firmAccount.getBalance());
		//System.out.println(debitCard.getCardNumber());
		//System.out.println(firmAccount.getAccountNumber());
		Bank mBank = new Bank("mBank", center);
		center.addBank(mBank);
		mBank.addPerson(adasko);
		Card debitCard1 = new Debit(adasko,mBank);
		mBank.addPersonsCard(debitCard1);
		//System.out.println(debitCard1.getCardNumber());
		//mBank.addPersonsCard(debitCard);
		
		System.out.println(debitCard.getBalance());
		System.out.println(firmAccount.getBalance());
		firm.callAutorization(debitCard, firmAccount, 50, center);
		System.out.println(debitCard.getBalance());
		System.out.println(firmAccount.getBalance());
				
		//for (LogData x: center.getLogData())
		//{
		//	System.out.println(x.getDate());
		//}
		
		
		Bank Mbank = new Bank("Mbank", center);
		Bank CreditAgricole = new Bank("CreditAgricole", center);
		Bank BZWBK = new Bank("BZWBK", center);
		Person Tom = new Person("Tommy","Shelby");
		Person John = new Person("Johnny","Shelby");
		Person Art = new Person("Arthur","Shelby");
		Person x = new Person ("Jan","Kowalski");
		Person y = new Person ("Arthur", "Boruc");
		PKO.addPerson(Tom);
		Mbank.addPerson(John);
		Mbank.addPerson(Tom);
		Mbank.addPerson(Art);
		BZWBK.addPerson(x);
		BZWBK.addPerson(adasko);
		BZWBK.addPerson(Art);
		BZWBK.addPerson(John);
		CreditAgricole.addPerson(Art);
		CreditAgricole.addPerson(y);
		CreditAgricole.addPerson(x);
		CreditAgricole.addPerson(adasko);
		Card debitCard11 = new Debit(adasko,BZWBK);
		Card debitCard2 = new Debit(adasko,CreditAgricole);
		Card debitCard3 = new Debit(x,CreditAgricole);
		Card debitCard4 = new Debit(y,CreditAgricole);
		Card debitCard5 = new Debit(Art,CreditAgricole);
		Card debitCard6 = new Debit(x,BZWBK);
		Card debitCard7 = new Debit(Art,BZWBK);
		Card debitCard8 = new Debit(John,BZWBK);
		Card debitCard9 = new Debit(John,Mbank);
		Card debitCard0 = new Debit(Tom,Mbank);
		Card debitCard00 = new Debit(Art,Mbank);
		debitCard11.payIn(5000);
		debitCard2.payIn(5000);
		debitCard3.payIn(5000);
		debitCard4.payIn(5000);
		debitCard5.payIn(5000);
		debitCard6.payIn(5000);
		debitCard7.payIn(5000);
		debitCard8.payIn(5000);
		debitCard9.payIn(5000);
		debitCard0.payIn(5000);
		debitCard00.payIn(5000);
		
		Firm Lidl = new Shop("Lidl");
		center.addFirm(Lidl);
		FirmAccount kontoLidla = new FirmAccount(Lidl,CreditAgricole);
		CreditAgricole.addFirmAccount(kontoLidla);
		
		Firm Tesco = new Shop("Tesco");
		center.addFirm(Tesco);
		FirmAccount kontoTesco = new FirmAccount(Tesco,Mbank);
		Mbank.addFirmAccount(kontoTesco);
		
		Firm Osiedlowy = new Shop("Osiedlowy");
		center.addFirm(Osiedlowy);
		FirmAccount kontoOsiedlowy = new FirmAccount(Osiedlowy,BZWBK);
		BZWBK.addFirmAccount(kontoOsiedlowy);
		
		firm.callAutorization(debitCard11, firmAccount, 50, center);
		Osiedlowy.callAutorization(debitCard11, kontoOsiedlowy, 50, center);
		Lidl.callAutorization(debitCard11, kontoLidla, 505.0, center);
		Tesco.callAutorization(debitCard2, kontoTesco, 50124.0, center);
		Tesco.callAutorization(debitCard3, kontoTesco, 50.0, center);
		Tesco.callAutorization(debitCard4, kontoTesco, 12.0, center);
		Tesco.callAutorization(debitCard0, kontoTesco, 501.0, center);
		Tesco.callAutorization(debitCard2, kontoTesco, 503.0, center);
		Lidl.callAutorization(debitCard3, kontoLidla, 501.0, center);
		Lidl.callAutorization(debitCard4, kontoLidla, 503.0, center);
		Lidl.callAutorization(debitCard5, kontoLidla, 504.0, center);
		Osiedlowy.callAutorization(debitCard1, kontoOsiedlowy, 15.0, center);
		Osiedlowy.callAutorization(debitCard2, kontoOsiedlowy, 502.0, center);
		Osiedlowy.callAutorization(debitCard5, kontoOsiedlowy, 50.23, center);
		Osiedlowy.callAutorization(debitCard3, kontoOsiedlowy, 50.0, center);
		
		
		
		String firma ="";
		String banek = "";
		String imie = "Arthur";
		String nazwisko = "ShelbY";
		double kwota =0;
		boolean Jak =false;
		int Numer = 30001;
		
			
		center.search(firma, banek, Numer, imie, nazwisko, kwota,  Jak);
	}
}
	/*	
		LinkedList<LogData> logsToAdd = new LinkedList<LogData>();
		logsToAdd=center.getLogData();
	

		
		
		String fileName = "logs.bin";
			try {
				ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Done writing");
			
		//String fileName = "logs.bin";
		//LinkedList<LogData> logsToAdd = new LinkedList<LogData>();
		
		try {
				ObjectInputStream is =new ObjectInputStream(new FileInputStream(fileName));
				for(LogData z:logsToAdd)
				{
					System.out.println(z.getAmount());				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			String fileName2 = "data.bin";
			try {
				ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream(fileName2));
				os2.writeObject(center);
				os2.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Done writing app data");
			//String fileName2 = "data.bin";
			try {
				ObjectInputStream is2 =  new ObjectInputStream(new FileInputStream(fileName2));
				Center centerLoaded = (Center) is2.readObject();
				ArrayList<Bank> banksLoaded = centerLoaded.getBanks();
				is2.close();
				for(Bank k:banksLoaded) {
					 List<Card> cardsLoaded= k.getCards();
					 for(Card c:cardsLoaded)
					 {
						 System.out.println(k.getBankName()+ c.getCardNumber()+"\n");
					 }	
				}			
				} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			


}
}

*/