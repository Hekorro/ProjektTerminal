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
//trzeba pomyslec jak rozwiazac sprawe numerow kart w kilku bankach
	public void addPersonsCard(Person person) {
		Card card = new Card(person);
		cardList.add(card);
	}
	
	public void addPersonCard(Person person) {}
	
	public void addPerson(Person person) {}
	
	public void addFirmAccount(Firm firm, Bank bank) {}
	public void addPerson(String firstName,String secondName) {
		Person person = new Person(firstName,secondName);
		personsList.add(person);
	}

	public void addFirmAccount(Firm firm) {
		FirmAccount firmAccount = new FirmAccount(firm);
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
		return true;
	}
	
	//podobnie klasa confirmAutorization
	public boolean confirmAutorization(FirmAccount firmAccount,double amount)
	{
		return true;
	}
	public boolean checkCardNumber(int x)
	{
		for(int x1:cardNumberList)
		{
			if(x1==x)
			{
				return false;
			}
		}
		return true;
	}
	public int generateCardNumber()
	{
		Random random = new Random();
		int a=0;
		do
		{
			a = random.nextInt(500000)+100000;
		}while(checkCardNumber(a)==true);
		return a;
	}
		
}
