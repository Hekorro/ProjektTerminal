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

	public String getBankName()
	{
		return bankName;
	}
	

	public LinkedList<Person> getPersons()
	{
		return personsList;
	}

	public LinkedList<FirmAccount> getFirmAccount()
	{
		return firmAccountsList;
	}
	
	public LinkedList<Card> getCards()
	{
		return cardList;
	}
	
	public void addPersonCard(Person person) {}
	
	public void addPerson(Person person) {}
	
	public void addFirmAccount(FirmAccount firmAccount) {}
	
	public void deletePerson(Person person) {}
	
	public void deletePersonCard(Person person) {}
	
	public void deleteFirmAccount(FirmAccount firmAccount){}
	
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
}
