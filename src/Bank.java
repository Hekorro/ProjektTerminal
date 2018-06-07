import java.util.*;

public class Bank {

	Bank(){}
	Bank(String bankName){
		this.bankName=bankName;
	}
	
private String bankName;
private LinkedList<FirmAccount> firmAccountsList = new LinkedList<FirmAccount>();
private LinkedList<Person> personsList = new LinkedList<Person>();
private LinkedList<Card> cardList = new LinkedList<Card>();
private LinkedList<Integer> cardNumberList = new LinkedList<Integer>();

	
	public List<Integer> getCardNumberList() {
	return cardNumberList;
}
	public List<Person> getPersons()
	{
		return personsList;
	}

	public List<FirmAccount> getFirmAccount()
	{
		return firmAccountsList;
	}
	
	public List<Card> getCards()
	{
		return cardList;
	}
//trzeba pomyslec jak rozwiazac sprawe numerow kart w kilku bankach i sprawdziæ czy osoba istnieje
	public void addPersonsCard(Person person,Center center) {
		
		boolean check=false;
		int person_number=0;
		LinkedList<Bank> banks = new LinkedList<Bank>();
		banks=center.getBanks();
		Random random = new Random();
		do {
			int a = random.nextInt(90000)+10000;
			System.out.print(a);	
		for(Bank banktest:banks)
		{
		for(int b:banktest.getCardNumberList())	
		{
			if(a!=b)
				check = true;
				else {
					check = false;
					break;
				}
		if(check==false) break;
		}
		
		}
		}while(check==true);
		
		Card card  = new Card(person,person_number);
		cardList.add(card);
		for(Bank banktest:banks) {
			banktest=null;
		}
		
		
	}

	
	
	public void addPerson(Person person) {
		personsList.add(person);
	}

	public void addFirmAccount(Firm firm,Center center) {
		boolean check=false;
		boolean general_check=false;
		int person_number=0;
		LinkedList<Bank> banks = new LinkedList<Bank>();
		banks=center.getBanks();
		Random random = new Random();
		do {
			int a = random.nextInt(90000)+10000;
		do {	
		for(Bank banktest:banks)
		do {
		for(int b:banktest.getCardNumberList())	
		{
			if(a!=b)
				check = true;
				else check = false;
				person_number=a;
		}
		}while(check==false);
		}while(check==false);
		}while(check==true);
		
		FirmAccount firmAccount  = new FirmAccount(firm,person_number);
		firmAccountsList.add(firmAccount);
		for(Bank banktest:banks) {
			banktest=null;
		}
		firmAccountsList.add(firmAccount);
	}
	
	public void deletePerson(Person person) {
		personsList.remove(person);
		person=null;
	}
	public void deletePersonCard(Card card) {
		cardList.remove(card);
		card=null;
	}
	
	public void deleteFirmAccount(FirmAccount firmAccount){
		firmAccountsList.remove(firmAccount);
		firmAccount=null;
	}
	
	//klasa confirmAutorization do glebszego przetworzenia
	public boolean confirmAutorization(Card card, double amount)
	{
		if(card.withdraw(amount)==false)
		{
			return false;
		}
		else
		{
			card.withdraw(amount);
			return true;
		}
		
	}
	
	//podobnie klasa confirmAutorization
	public boolean confirmAutorization(Card card,FirmAccount firmAccount,double amount)
	{
		if(card.pay(amount, firmAccount)==true)
		{
		return true;
		}
		else return false;
		
	}

		
}
