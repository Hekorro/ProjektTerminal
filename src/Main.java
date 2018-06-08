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
		
		
		
		}

}
