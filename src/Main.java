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
		debitCard.payIn(1000);
		System.out.println(debitCard.getBalance());
		firm.callAutorization(debitCard, firmAccount, 500, center);
		System.out.println(debitCard.getBalance());
		System.out.println(firmAccount.getBalance());
		System.out.println(debitCard.getCardNumber());
		System.out.println(firmAccount.getAccountNumber());
		Bank mBank = new Bank("mBank", center);
		center.addBank(mBank);
		mBank.addPerson(adasko);
		Card debitCard1 = new Debit(adasko,mBank);
		mBank.addPersonsCard(debitCard1);
		System.out.println(debitCard1.getCardNumber());
		mBank.addPersonsCard(debitCard);
		
		
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
			
			try {
				ObjectInputStream is =new ObjectInputStream(new FileInputStream(fileName));
				for(LogData x:logsToAdd)
				{
					System.out.println(x.getAmount());				}
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
