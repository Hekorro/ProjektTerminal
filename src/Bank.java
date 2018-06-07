import java.util.*;

public class Bank {

	Bank(){}
	Bank(String bankName,Center center){
		this.bankName=bankName;
		this.serialNumber=center.getBankSerialNumber();
		
	}
	
int serialNumber;


int cardNumber=1;


private String bankName;


private LinkedList<FirmAccount> firmAccountsList = new LinkedList<FirmAccount>();
private LinkedList<Person> personsList = new LinkedList<Person>();
private LinkedList<Card> cardList = new LinkedList<Card>();
private LinkedList<Integer> cardNumberList = new LinkedList<Integer>();

	
	
	public int getSerialNumber() {
	return serialNumber;
}
	public int getCardNumber() {
		return cardNumber;
	}
	

	public String getBankName() {
	return bankName;
}

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
	public void addPersonsCard(Card card,Center center) {
		
		cardList.add(card);
		cardNumber++;
		}
		

	
	
	public void addPerson(Person person) {
		personsList.add(person);
	}

	public void addFirmAccount(FirmAccount firmAccount,Center center) {
		firmAccountsList.add(firmAccount);
		cardNumber++;
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
